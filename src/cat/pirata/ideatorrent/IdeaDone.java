package cat.pirata.ideatorrent;

import cat.pirata.activities.R;


public class IdeaDone extends IdeaTorrent {
	private static Integer STATUS = 3;
	Integer LAYOUTSOLUTION = R.layout.idea_row_solucio_novote;

	// override
	protected Integer getSTATUS(){ return STATUS; }
	protected Integer getLAYOUTSOLUTION() { return LAYOUTSOLUTION; }
}
