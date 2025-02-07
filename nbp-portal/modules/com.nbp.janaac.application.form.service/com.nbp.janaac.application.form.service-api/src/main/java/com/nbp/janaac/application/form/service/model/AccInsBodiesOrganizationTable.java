/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_janaac_acc_ins_body_org&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AccInsBodiesOrganization
 * @generated
 */
public class AccInsBodiesOrganizationTable
	extends BaseTable<AccInsBodiesOrganizationTable> {

	public static final AccInsBodiesOrganizationTable INSTANCE =
		new AccInsBodiesOrganizationTable();

	public final Column<AccInsBodiesOrganizationTable, String> uuid =
		createColumn("uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesOrganizationTable, Long>
		accInsBodiesOrganizationId = createColumn(
			"accInsBodiesOrganizationId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AccInsBodiesOrganizationTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesOrganizationTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesOrganizationTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesOrganizationTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesOrganizationTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesOrganizationTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesOrganizationTable, String> insLegalEntity =
		createColumn(
			"insLegalEntity", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesOrganizationTable, String>
		insLegalStatusEntity = createColumn(
			"insLegalStatusEntity", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesOrganizationTable, String> insBodyOrgPart =
		createColumn(
			"insBodyOrgPart", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesOrganizationTable, String>
		insPersonnelName = createColumn(
			"insPersonnelName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesOrganizationTable, String>
		insPersonnelPosition = createColumn(
			"insPersonnelPosition", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesOrganizationTable, String> insStaffSize =
		createColumn(
			"insStaffSize", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesOrganizationTable, String>
		insStaffComplement = createColumn(
			"insStaffComplement", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesOrganizationTable, String> insIncomeSource =
		createColumn(
			"insIncomeSource", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesOrganizationTable, String> insOrgBodyType =
		createColumn(
			"insOrgBodyType", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesOrganizationTable, String>
		insBodyOwnOrgClient = createColumn(
			"insBodyOwnOrgClient", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesOrganizationTable, String>
		insBodyOtherOrgClient = createColumn(
			"insBodyOtherOrgClient", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccInsBodiesOrganizationTable, Long>
		janaacApplicationId = createColumn(
			"janaacApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private AccInsBodiesOrganizationTable() {
		super(
			"nbp_janaac_acc_ins_body_org", AccInsBodiesOrganizationTable::new);
	}

}