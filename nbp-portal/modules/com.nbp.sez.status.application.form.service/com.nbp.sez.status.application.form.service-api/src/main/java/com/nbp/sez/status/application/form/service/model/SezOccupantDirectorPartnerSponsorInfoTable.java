/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_sez_occ_dir_part_spon&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantDirectorPartnerSponsorInfo
 * @generated
 */
public class SezOccupantDirectorPartnerSponsorInfoTable
	extends BaseTable<SezOccupantDirectorPartnerSponsorInfoTable> {

	public static final SezOccupantDirectorPartnerSponsorInfoTable INSTANCE =
		new SezOccupantDirectorPartnerSponsorInfoTable();

	public final Column<SezOccupantDirectorPartnerSponsorInfoTable, Long>
		sezOccDirectSpoId = createColumn(
			"sezOccDirectSpoId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<SezOccupantDirectorPartnerSponsorInfoTable, Long>
		groupId = createColumn(
			"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezOccupantDirectorPartnerSponsorInfoTable, Long>
		companyId = createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezOccupantDirectorPartnerSponsorInfoTable, Long>
		userId = createColumn(
			"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SezOccupantDirectorPartnerSponsorInfoTable, String>
		userName = createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezOccupantDirectorPartnerSponsorInfoTable, Date>
		createDate = createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezOccupantDirectorPartnerSponsorInfoTable, Date>
		modifiedDate = createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezOccupantDirectorPartnerSponsorInfoTable, Date>
		occAppDate = createColumn(
			"occAppDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SezOccupantDirectorPartnerSponsorInfoTable, String>
		occDirectorName = createColumn(
			"occDirectorName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezOccupantDirectorPartnerSponsorInfoTable, String>
		occDirectorStreetAddress = createColumn(
			"occDirectorStreetAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezOccupantDirectorPartnerSponsorInfoTable, String>
		occDirectorZipCode = createColumn(
			"occDirectorZipCode", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezOccupantDirectorPartnerSponsorInfoTable, String>
		occDirectorCountry = createColumn(
			"occDirectorCountry", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SezOccupantDirectorPartnerSponsorInfoTable, String>
		counter = createColumn(
			"counter", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SezOccupantDirectorPartnerSponsorInfoTable, Long>
		sezStatusApplicationId = createColumn(
			"sezStatusApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private SezOccupantDirectorPartnerSponsorInfoTable() {
		super(
			"nbp_sez_occ_dir_part_spon",
			SezOccupantDirectorPartnerSponsorInfoTable::new);
	}

}