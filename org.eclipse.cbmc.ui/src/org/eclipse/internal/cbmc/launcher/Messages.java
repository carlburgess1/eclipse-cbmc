package org.eclipse.internal.cbmc.launcher;

import java.text.MessageFormat;
import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {

	private static final String BUNDLE_NAME = "org.eclipse.internal.cbmc.launcher.messages"; //$NON-NLS-1$
	public static String MainLaunchingTab_name;
	public static String MainLaunchingTab_error_cbmc_isEmpty;
	public static String MainLaunchingTab_error_cbmc_notExist;
	public static String MainLaunchingTab_error_cbmc_isOldVersion;
	public static String MainLaunchingTab_error_cbmc_versionNotFound;
	public static String MainLaunchingTab_error_cbmc_compilerNotFound;
	public static String MainLaunchingTab_error_file_isEmpty;
	public static String MainLaunchingTab_error_file_notExists;
	public static String MainLaunchingTab_error_file_isNotSourceOrBinary;
	public static String MainLaunchingTab_error_file_gotoNotFound;
	public static String MainLaunchingTab_error_unwind;

	public static String MainLaunchingTab_labelCBMC;
	public static String MainLaunchingTab_labelFile;
	public static String MainLaunchingTab_showloops;
	public static String MainLaunchingTab_labelAutorun;
	public static String MainLaunchingTab_labelFunction;
	public static String MainLaunchingTab_labelOptions;
	public static String MainLaunchingTab_labelLoops;
	public static String MainLaunchingTab_labelBrowse;
	public static String MainLaunchingTab_labelUnwind;
	public static String MainLaunchingTab_dialogCbmc;
	public static String MainLaunchingTab_dialogFileTitle;
	public static String MainLaunchingTab_dialogFileMesssage;

	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}

	public static String format(String message, Object[] objects) {
		return MessageFormat.format(message, objects);
	}
}
