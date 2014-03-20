package com._360scheduling.schema.dsmodelling;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {

	public ObjectFactory() {
	}

	public DsModelling createDsModelling() {
		return new DsModelling();
	}

	public DsModelling.RAMResource createDsModellingRAMResource() {
		return new DsModelling.RAMResource();
	}

	public DsModelling.RAMResourceDivision createDsModellingRAMResourceDivision() {
		return new DsModelling.RAMResourceDivision();
	}

	public DsModelling.RAMUpdate createDsModellingRAMUpdate() {
		return new DsModelling.RAMUpdate();
	}

	public DsModelling.RAMDataUpdate createDsModellingRAMDataUpdate() {
		return new DsModelling.RAMDataUpdate();
	}

	public DsModelling.RAMUnavailability createDsModellingRAMUnavailability() {
		return new DsModelling.RAMUnavailability();
	}

	public DsModelling.RAMTimePattern createDsModellingRAMTimePattern() {
		return new DsModelling.RAMTimePattern();
	}

	public DsModelling.RAMTimePatternTemplate createDsModellingRAMTimePatternTemplate() {
		return new DsModelling.RAMTimePatternTemplate();
	}

	public DsModelling.RAMTimePatternTemplateItem createDsModellingRAMTimePatternTemplateItem() {
		return new DsModelling.RAMTimePatternTemplateItem();
	}

	public DsModelling.RAMDivision createDsModellingRAMDivision() {
		return new DsModelling.RAMDivision();
	}
}
