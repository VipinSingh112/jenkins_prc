/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_healthcare_applicant_add&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see HealthCareApplicantAddress
 * @generated
 */
public class HealthCareApplicantAddressTable
	extends BaseTable<HealthCareApplicantAddressTable> {

	public static final HealthCareApplicantAddressTable INSTANCE =
		new HealthCareApplicantAddressTable();

	public final Column<HealthCareApplicantAddressTable, Long>
		healthCareApplicantAddressId = createColumn(
			"healthCareApplicantAddressId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<HealthCareApplicantAddressTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<HealthCareApplicantAddressTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<HealthCareApplicantAddressTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<HealthCareApplicantAddressTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<HealthCareApplicantAddressTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<HealthCareApplicantAddressTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<HealthCareApplicantAddressTable, String>
		applicantMailingAddress = createColumn(
			"applicantMailingAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<HealthCareApplicantAddressTable, Long>
		healthCareApplicationId = createColumn(
			"healthCareApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);
	public final Column<HealthCareApplicantAddressTable, Long>
		healthCareApplicantInfoId = createColumn(
			"healthCareApplicantInfoId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private HealthCareApplicantAddressTable() {
		super(
			"nbp_healthcare_applicant_add",
			HealthCareApplicantAddressTable::new);
	}

}