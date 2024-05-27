package edu.web.news.controller.command;

import java.util.HashMap;
import java.util.Map;

import edu.web.news.controller.command.impl.AddNews;
import edu.web.news.controller.command.impl.DeleteNews;
import edu.web.news.controller.command.impl.DisplayAllNews;
import edu.web.news.controller.command.impl.DoAuth;
import edu.web.news.controller.command.impl.DoRegistration;
import edu.web.news.controller.command.impl.GoToAdminPage;
import edu.web.news.controller.command.impl.GoToAuthenticationPage;
import edu.web.news.controller.command.impl.GoToRegistrationPage;
import edu.web.news.controller.command.impl.GoToStartPage;
import edu.web.news.controller.command.impl.NoSuchCommand;
import edu.web.news.controller.command.impl.UpdateNews;

public class CommandProvider {

	private Map<CommandName, Command> commands = new HashMap<>();

	public CommandProvider() {
		commands.put(CommandName.GO_TO_START_PAGE, new GoToStartPage());
		commands.put(CommandName.GO_TO_AUTHENTICATION_PAGE, new GoToAuthenticationPage());
		commands.put(CommandName.GO_TO_REGISTRATION_PAGE, new GoToRegistrationPage());
		commands.put(CommandName.GO_TO_ADMIN_PAGE, new GoToAdminPage());
		commands.put(CommandName.DO_REGISTRATION, new DoRegistration());
		commands.put(CommandName.DO_AUTH, new DoAuth());
		commands.put(CommandName.ADD_NEWS, new AddNews());
		commands.put(CommandName.DELETE_NEWS, new DeleteNews());
		commands.put(CommandName.UPDATE_NEWS, new UpdateNews());
		commands.put(CommandName.DISPLAY_ALL_NEWS, new DisplayAllNews());

		commands.put(CommandName.NO_SUCH_COMMAND, new NoSuchCommand());

	}

	public Command takeCommand(String userCommand) {
		CommandName commandName;
		Command command;

		try {
			commandName = CommandName.valueOf(userCommand.toUpperCase());
			command = commands.get(commandName);
		} catch (IllegalArgumentException | NullPointerException e) {
			command = commands.get(CommandName.NO_SUCH_COMMAND);
		}
		return command;
	}
}
