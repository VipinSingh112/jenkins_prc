/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_osi_services_assignm_det&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesAssignmentDetailinfo
 * @generated
 */
public class OsiServicesAssignmentDetailinfoTable
	extends BaseTable<OsiServicesAssignmentDetailinfoTable> {

	public static final OsiServicesAssignmentDetailinfoTable INSTANCE =
		new OsiServicesAssignmentDetailinfoTable();

	public final Column<OsiServicesAssignmentDetailinfoTable, String> uuid =
		createColumn("uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiServicesAssignmentDetailinfoTable, Long> osiADId =
		createColumn("osiADId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<OsiServicesAssignmentDetailinfoTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiServicesAssignmentDetailinfoTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiServicesAssignmentDetailinfoTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<OsiServicesAssignmentDetailinfoTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiServicesAssignmentDetailinfoTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OsiServicesAssignmentDetailinfoTable, Date>
		modifiedDate = createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<OsiServicesAssignmentDetailinfoTable, String>
		assignmentName = createColumn(
			"assignmentName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiServicesAssignmentDetailinfoTable, Date>
		assignmentDated = createColumn(
			"assignmentDated", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<OsiServicesAssignmentDetailinfoTable, String>
		selectedAssignmentAttached = createColumn(
			"selectedAssignmentAttached", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OsiServicesAssignmentDetailinfoTable, String>
		assignmentAddress = createColumn(
			"assignmentAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<OsiServicesAssignmentDetailinfoTable, String>
		trusteeAct = createColumn(
			"trusteeAct", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<OsiServicesAssignmentDetailinfoTable, Long>
		osiServicesApplicationId = createColumn(
			"osiServicesApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private OsiServicesAssignmentDetailinfoTable() {
		super(
			"nbp_osi_services_assignm_det",
			OsiServicesAssignmentDetailinfoTable::new);
	}

}