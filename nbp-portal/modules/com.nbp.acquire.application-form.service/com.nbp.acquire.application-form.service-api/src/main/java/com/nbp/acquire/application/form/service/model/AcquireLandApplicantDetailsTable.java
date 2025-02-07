/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_acquire_land_details&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see AcquireLandApplicantDetails
 * @generated
 */
public class AcquireLandApplicantDetailsTable
	extends BaseTable<AcquireLandApplicantDetailsTable> {

	public static final AcquireLandApplicantDetailsTable INSTANCE =
		new AcquireLandApplicantDetailsTable();

	public final Column<AcquireLandApplicantDetailsTable, Long>
		acquireLandApplicantDetailsId = createColumn(
			"acquireLandApplicantDetailsId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<AcquireLandApplicantDetailsTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AcquireLandApplicantDetailsTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AcquireLandApplicantDetailsTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AcquireLandApplicantDetailsTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AcquireLandApplicantDetailsTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AcquireLandApplicantDetailsTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AcquireLandApplicantDetailsTable, String>
		landApplicantName = createColumn(
			"landApplicantName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AcquireLandApplicantDetailsTable, String>
		landApplicantGender = createColumn(
			"landApplicantGender", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AcquireLandApplicantDetailsTable, Date>
		landApplicantDob = createColumn(
			"landApplicantDob", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<AcquireLandApplicantDetailsTable, String>
		landApplicantTrnNum = createColumn(
			"landApplicantTrnNum", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AcquireLandApplicantDetailsTable, String>
		landApplicantHomeAddr = createColumn(
			"landApplicantHomeAddr", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AcquireLandApplicantDetailsTable, String>
		landApplicantMailingAddr = createColumn(
			"landApplicantMailingAddr", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AcquireLandApplicantDetailsTable, String>
		landApplicantPhoneNum = createColumn(
			"landApplicantPhoneNum", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AcquireLandApplicantDetailsTable, String>
		landApplicantEmail = createColumn(
			"landApplicantEmail", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<AcquireLandApplicantDetailsTable, Long>
		acquireApplicationId = createColumn(
			"acquireApplicationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private AcquireLandApplicantDetailsTable() {
		super(
			"nbp_acquire_land_details", AcquireLandApplicantDetailsTable::new);
	}

}