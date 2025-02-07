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
 * The table class for the &quot;nbp_ncbj_organization_detail&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjOrganizationDetail
 * @generated
 */
public class NcbjOrganizationDetailTable
	extends BaseTable<NcbjOrganizationDetailTable> {

	public static final NcbjOrganizationDetailTable INSTANCE =
		new NcbjOrganizationDetailTable();

	public final Column<NcbjOrganizationDetailTable, Long>
		ncbjOrganizationDetailId = createColumn(
			"ncbjOrganizationDetailId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<NcbjOrganizationDetailTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjOrganizationDetailTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjOrganizationDetailTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<NcbjOrganizationDetailTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjOrganizationDetailTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcbjOrganizationDetailTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<NcbjOrganizationDetailTable, String>
		nameOfOrganization = createColumn(
			"nameOfOrganization", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjOrganizationDetailTable, String> address =
		createColumn(
			"address", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjOrganizationDetailTable, String> telephoneNumber =
		createColumn(
			"telephoneNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjOrganizationDetailTable, String> faxNumber =
		createColumn(
			"faxNumber", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjOrganizationDetailTable, String> emailAddress =
		createColumn(
			"emailAddress", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjOrganizationDetailTable, String>
		headOfOrganization = createColumn(
			"headOfOrganization ", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjOrganizationDetailTable, String> position =
		createColumn(
			"position", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjOrganizationDetailTable, String> contactPersonName =
		createColumn(
			"contactPersonName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjOrganizationDetailTable, String>
		contactPersonEmailAddress = createColumn(
			"contactPersonEmailAddress ", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjOrganizationDetailTable, String>
		contactPersonPosition = createColumn(
			"contactPersonPosition ", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjOrganizationDetailTable, String> managementSystem =
		createColumn(
			"managementSystem", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjOrganizationDetailTable, String>
		determinedTheScope = createColumn(
			"determinedTheScope", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjOrganizationDetailTable, String>
		pleaseStageTheScope = createColumn(
			"pleaseStageTheScope", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjOrganizationDetailTable, String> positionSecondFo =
		createColumn(
			"positionSecondFo", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjOrganizationDetailTable, String>
		managementSystemFo = createColumn(
			"managementSystemFo", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjOrganizationDetailTable, String> productTypes =
		createColumn(
			"productTypes", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjOrganizationDetailTable, String> productLine =
		createColumn(
			"productLine", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjOrganizationDetailTable, String> haccpStudies =
		createColumn(
			"haccpStudies", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjOrganizationDetailTable, String>
		criticalControlPoints = createColumn(
			"criticalControlPoints", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjOrganizationDetailTable, String> operationalNumber =
		createColumn(
			"operationalNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjOrganizationDetailTable, String> productionSize =
		createColumn(
			"productionSize", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjOrganizationDetailTable, String> warehouseSize =
		createColumn(
			"warehouseSize", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<NcbjOrganizationDetailTable, String>
		warehouseDetailSize = createColumn(
			"warehouseDetailSize", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjOrganizationDetailTable, String> seasonalProcess =
		createColumn(
			"seasonalProcess", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<NcbjOrganizationDetailTable, Long> ncbjApplicationId =
		createColumn(
			"ncbjApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private NcbjOrganizationDetailTable() {
		super("nbp_ncbj_organization_detail", NcbjOrganizationDetailTable::new);
	}

}