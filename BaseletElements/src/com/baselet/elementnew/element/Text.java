package com.baselet.elementnew.element;

import com.baselet.diagram.draw.DrawHandler;
import com.baselet.element.sticking.polygon.NoStickingPolygonGenerator;
import com.baselet.elementnew.NewGridElement;
import com.baselet.elementnew.base.ElementId;
import com.baselet.elementnew.facet.PropertiesParserState;
import com.baselet.elementnew.facet.Settings;
import com.baselet.elementnew.settings.SettingsText;

public class Text extends NewGridElement {

	@Override
	protected Settings createSettings() {
		return new SettingsText();
	}

	@Override
	public ElementId getId() {
		return ElementId.Text;
	}

	@Override
	protected void drawCommonContent(DrawHandler drawer, PropertiesParserState state) {
		state.setStickingPolygonGenerator(NoStickingPolygonGenerator.INSTANCE);
	}

}
