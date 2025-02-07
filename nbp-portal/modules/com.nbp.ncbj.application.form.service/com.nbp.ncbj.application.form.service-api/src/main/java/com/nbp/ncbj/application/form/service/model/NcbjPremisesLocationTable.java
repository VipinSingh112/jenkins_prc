/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_ncbj_premises_location&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjPremisesLocation
 * @generated
 */
public class NcbjPremisesLocationTable
	extends BaseTable<NcbjPremisesLocationTable> {

	public static final NcbjPremisesLocationTable INSTANCE =
		new NcbjPremisesLocationTable();

	public final Column<NcbjPremisesLocationTable, Long>
		ncbjPremisesLocationId = createColumn(
			"ncbjPremisesLocationId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<NcbjPremisesLocationTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjPremisesLocationTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjPremisesLocationTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjPremisesLocationTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjPremisesLocationTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcbjPremisesLocationTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcbjPremisesLocationTable, String> transferReasonDraft =
		createColumn(
			"transferReasonDraft", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjPremisesLocationTable, String> activityExclusion =
		createColumn(
			"activityExclusion", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjPremisesLocationTable, String> transferReasonAct =
		createColumn(
			"transferReasonAct", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjPremisesLocationTable, String>
		productionFacilitySize = createColumn(
			"productionFacilitySize", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjPremisesLocationTable, String>
		warehouseFacilitySize = createColumn(
			"warehouseFacilitySize", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjPremisesLocationTable, String> facilitiesLocation =
		createColumn(
			"facilitiesLocation", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjPremisesLocationTable, String>
		detailForDiffManagement = createColumn(
			"detailForDiffManagement", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjPremisesLocationTable, Long> ncbjApplicationId =
		createColumn(
			"ncbjApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private NcbjPremisesLocationTable() {
		super("nbp_ncbj_premises_location", NcbjPremisesLocationTable::new);
	}

}