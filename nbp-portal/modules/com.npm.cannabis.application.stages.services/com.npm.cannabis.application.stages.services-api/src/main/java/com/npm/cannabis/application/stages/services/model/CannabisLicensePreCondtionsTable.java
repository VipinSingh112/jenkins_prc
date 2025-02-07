/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_cannabis_pre_conditions&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisLicensePreCondtions
 * @generated
 */
public class CannabisLicensePreCondtionsTable
	extends BaseTable<CannabisLicensePreCondtionsTable> {

	public static final CannabisLicensePreCondtionsTable INSTANCE =
		new CannabisLicensePreCondtionsTable();

	public final Column<CannabisLicensePreCondtionsTable, Long>
		cannabisPreconditionsId = createColumn(
			"cannabisPreconditionsId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<CannabisLicensePreCondtionsTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CannabisLicensePreCondtionsTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CannabisLicensePreCondtionsTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CannabisLicensePreCondtionsTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisLicensePreCondtionsTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CannabisLicensePreCondtionsTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CannabisLicensePreCondtionsTable, String> caseId =
		createColumn(
			"caseId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisLicensePreCondtionsTable, String> precondition =
		createColumn(
			"precondition", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisLicensePreCondtionsTable, String> licenseType =
		createColumn(
			"licenseType", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisLicensePreCondtionsTable, String> status =
		createColumn(
			"status", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CannabisLicensePreCondtionsTable, Long>
		cannabisApplicationId = createColumn(
			"cannabisApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private CannabisLicensePreCondtionsTable() {
		super(
			"nbp_cannabis_pre_conditions",
			CannabisLicensePreCondtionsTable::new);
	}

}