package commands;

import infra.MICommand;
import infra.MIOutput;

import java.util.ArrayList;
import java.util.List;

import org.kohsuke.args4j.Option;

import process.Process;
import results.data.Frame;
import results.sync.Done;

public class StackListFrames extends MICommand {
	@Option(name="--thread", required=true)
	int threadId;
	
	@Override
	public MIOutput perform(Process process) {
		int lowerStack = 0;
		int upperStack = Integer.MAX_VALUE;
		
		if (arguments.size() == 2) {
			lowerStack = Integer.valueOf(arguments.get(0));
			upperStack = Integer.valueOf(arguments.get(1));
		}

		List<Frame> result = new ArrayList<Frame>();
		Frame.toFrames(result, process.getThread(threadId).getStack(), lowerStack, upperStack, 0);
		return new Done(this, "stack", Frame.serializeAsFrameOutput(result), false);
	}
}
