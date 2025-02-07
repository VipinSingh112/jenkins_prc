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
 * The table class for the &quot;nbp_janaac_acc_medi_org&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AccMediLabOrganization
 * @generated
 */
public class AccMediLabOrganizationTable
	extends BaseTable<AccMediLabOrganizationTable> {

	public static final AccMediLabOrganizationTable INSTANCE =
		new AccMediLabOrganizationTable();

	public final Column<AccMediLabOrganizationTable, String> uuid =
		createColumn("uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccMediLabOrganizationTable, Long>
		accMediLabOrganizationId = createColumn(
			"accMediLabOrganizationId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AccMediLabOrganizationTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccMediLabOrganizationTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccMediLabOrganizationTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AccMediLabOrganizationTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccMediLabOrganizationTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AccMediLabOrganizationTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AccMediLabOrganizationTable, String>
		laboratoryLegalEntity = createColumn(
			"laboratoryLegalEntity", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabOrganizationTable, String> legalStatus =
		createColumn(
			"legalStatus", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccMediLabOrganizationTable, String>
		laboratoryPartOfOrg = createColumn(
			"laboratoryPartOfOrg", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabOrganizationTable, String>
		laboratoryPartOfOrgName = createColumn(
			"laboratoryPartOfOrgName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabOrganizationTable, String>
		laboratoryPartOfOrgPos = createColumn(
			"laboratoryPartOfOrgPos", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabOrganizationTable, String> nameOfAnalysts =
		createColumn(
			"nameOfAnalysts", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AccMediLabOrganizationTable, String> majorIncomeSource =
		createColumn(
			"majorIncomeSource", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabOrganizationTable, String> laboratoryClients =
		createColumn(
			"laboratoryClients", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AccMediLabOrganizationTable, Long> janaacApplicationId =
		createColumn(
			"janaacApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private AccMediLabOrganizationTable() {
		super("nbp_janaac_acc_medi_org", AccMediLabOrganizationTable::new);
	}

}