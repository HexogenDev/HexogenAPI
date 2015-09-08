package net.cyanwool.api.command.defaultcmd;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import net.cyanwool.api.CyanWool;
import net.cyanwool.api.command.ICommand;
import net.cyanwool.api.command.ICommandSender;
import net.cyanwool.api.plugins.IPlugin;
import net.cyanwool.api.utils.ChatColor;

public class PluginsCommand implements ICommand {

	private List<String> aliases;

	@Override
	public void execute(ICommandSender sender, String[] args) {
		String pluginLang = CyanWool.getLanguageManager().getLanguageFile(sender.getLangCode()).getValue("cw.installedPlugins");
		Collection<IPlugin> pluginList = CyanWool.getPluginManager().getPlugins();

		String msg = ChatColor.AQUA + pluginLang + ChatColor.WHITE + " (" + pluginList.size() + "): ";

		if (!pluginList.isEmpty()) {
			for (IPlugin plugin : pluginList) {
				String at = plugin.getDescription().getName();
				if (plugin.isEnabled()) {
					at = ChatColor.GREEN + at;
				} else {
					at = ChatColor.RED + at;
				}
				msg += at + ChatColor.WHITE + ", ";
			}
			msg = msg.substring(0, msg.length() - 2);
		}
		sender.sendMessage(msg);
	}

	@Override
	public String getName() {
		return "plugins";
	}

	@Override
	public String getDescription() {
		return "Get plugin list";
	}

	@Override
	public List<String> getAliases() {
		if (aliases == null) {
			aliases = new CopyOnWriteArrayList<String>();
			aliases.add("pl");
		}
		return aliases;
	}

}
