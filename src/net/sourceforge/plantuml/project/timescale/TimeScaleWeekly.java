/* ========================================================================
 * PlantUML : a free UML diagram generator
 * ========================================================================
 *
 * (C) Copyright 2009-2020, Arnaud Roques
 *
 * Project Info:  http://plantuml.com
 * 
 * If you like this project or if you find it useful, you can support us at:
 *
 * This file is part of PlantUML.
 *
 * PlantUML is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * PlantUML distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public
 * License for more details.
 *
 * You should have received a copy of the GNU General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301,
 * USA.
 *
 *
 * Original Author:  Arnaud Roques
 * 
 *
 */
package net.sourceforge.plantuml.project.timescale;

import net.sourceforge.plantuml.project.GCalendar;
import net.sourceforge.plantuml.project.core.Wink;

public class TimeScaleWeekly implements TimeScale {

	private static final int COMPRESS = 4;
	private final TimeScale daily;

	public TimeScaleWeekly(GCalendar calendar) {
		this.daily = new TimeScaleDaily(calendar, null);
	}

	public double getStartingPosition(Wink instant) {
		return daily.getStartingPosition(instant) / COMPRESS;
	}

	public double getEndingPosition(Wink instant) {
		return daily.getEndingPosition(instant) / COMPRESS;
	}

	public double getWidth(Wink instant) {
		return daily.getWidth(instant) / COMPRESS;
	}

}
