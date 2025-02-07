/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.application.form.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_factories_application&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see FactoriesApplicationRegistration
 * @generated
 */
public class FactoriesApplicationRegistrationTable
	extends BaseTable<FactoriesApplicationRegistrationTable> {

	public static final FactoriesApplicationRegistrationTable INSTANCE =
		new FactoriesApplicationRegistrationTable();

	public final Column<FactoriesApplicationRegistrationTable, Long>
		factoriesApplicationId = createColumn(
			"factoriesApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<FactoriesApplicationRegistrationTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FactoriesApplicationRegistrationTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FactoriesApplicationRegistrationTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FactoriesApplicationRegistrationTable, String>
		userName = createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FactoriesApplicationRegistrationTable, Date>
		createDate = createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FactoriesApplicationRegistrationTable, Date>
		modifiedDate = createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FactoriesApplicationRegistrationTable, String>
		entityId = createColumn(
			"entityId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FactoriesApplicationRegistrationTable, Integer> status =
		createColumn(
			"status", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<FactoriesApplicationRegistrationTable, String>
		applicationNumber = createColumn(
			"applicationNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FactoriesApplicationRegistrationTable, String> caseId =
		createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FactoriesApplicationRegistrationTable, String>
		expiredLicenseAppNumber = createColumn(
			"expiredLicenseAppNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FactoriesApplicationRegistrationTable, String>
		icmDocumentPath = createColumn(
			"icmDocumentPath", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FactoriesApplicationRegistrationTable, String>
		productCategory = createColumn(
			"productCategory", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FactoriesApplicationRegistrationTable, String>
		areYouProcessing = createColumn(
			"areYouProcessing", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FactoriesApplicationRegistrationTable, String>
		typeOfTransaction = createColumn(
			"typeOfTransaction", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FactoriesApplicationRegistrationTable, Long>
		pdfFileEntryId = createColumn(
			"pdfFileEntryId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FactoriesApplicationRegistrationTable, String>
		appCurrentStageName = createColumn(
			"appCurrentStageName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);

	private FactoriesApplicationRegistrationTable() {
		super(
			"nbp_factories_application",
			FactoriesApplicationRegistrationTable::new);
	}

}