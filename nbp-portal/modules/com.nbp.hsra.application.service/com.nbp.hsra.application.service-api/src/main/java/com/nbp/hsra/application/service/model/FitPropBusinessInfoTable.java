/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_hsra_fitprop_business&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see FitPropBusinessInfo
 * @generated
 */
public class FitPropBusinessInfoTable
	extends BaseTable<FitPropBusinessInfoTable> {

	public static final FitPropBusinessInfoTable INSTANCE =
		new FitPropBusinessInfoTable();

	public final Column<FitPropBusinessInfoTable, Long> fitPropBusinessInfoId =
		createColumn(
			"fitPropBusinessInfoId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<FitPropBusinessInfoTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FitPropBusinessInfoTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FitPropBusinessInfoTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<FitPropBusinessInfoTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FitPropBusinessInfoTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FitPropBusinessInfoTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<FitPropBusinessInfoTable, String> companyType =
		createColumn(
			"companyType", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FitPropBusinessInfoTable, String>
		applicantBusinessName = createColumn(
			"applicantBusinessName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FitPropBusinessInfoTable, String> applicantcomName =
		createColumn(
			"applicantcomName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FitPropBusinessInfoTable, String> applicantComAddress =
		createColumn(
			"applicantComAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FitPropBusinessInfoTable, String>
		applicantComAddressParish = createColumn(
			"applicantComAddressParish", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FitPropBusinessInfoTable, String> applicantComNo =
		createColumn(
			"applicantComNo", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FitPropBusinessInfoTable, String> applicantComEmail =
		createColumn(
			"applicantComEmail", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FitPropBusinessInfoTable, String>
		applicantComTelephone = createColumn(
			"applicantComTelephone", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FitPropBusinessInfoTable, String> applicantComTitle =
		createColumn(
			"applicantComTitle", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FitPropBusinessInfoTable, String> materialTechnology =
		createColumn(
			"materialTechnology", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FitPropBusinessInfoTable, String> relevantBox =
		createColumn(
			"relevantBox", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FitPropBusinessInfoTable, String> corporateDirector =
		createColumn(
			"corporateDirector", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FitPropBusinessInfoTable, String> facilitySources =
		createColumn(
			"facilitySources", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FitPropBusinessInfoTable, String> criminalFraud =
		createColumn(
			"criminalFraud", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FitPropBusinessInfoTable, String> professionalSubject =
		createColumn(
			"professionalSubject", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FitPropBusinessInfoTable, String> employmentResign =
		createColumn(
			"employmentResign", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FitPropBusinessInfoTable, String> mentallyIll =
		createColumn(
			"mentallyIll", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<FitPropBusinessInfoTable, String> bankruptAuthority =
		createColumn(
			"bankruptAuthority", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FitPropBusinessInfoTable, String> circumstancesEvent =
		createColumn(
			"circumstancesEvent", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FitPropBusinessInfoTable, String> partnershipHsra =
		createColumn(
			"partnershipHsra", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FitPropBusinessInfoTable, String> facilityAssociated =
		createColumn(
			"facilityAssociated", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<FitPropBusinessInfoTable, Long> hsraApplicationId =
		createColumn(
			"hsraApplicationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private FitPropBusinessInfoTable() {
		super("nbp_hsra_fitprop_business", FitPropBusinessInfoTable::new);
	}

}