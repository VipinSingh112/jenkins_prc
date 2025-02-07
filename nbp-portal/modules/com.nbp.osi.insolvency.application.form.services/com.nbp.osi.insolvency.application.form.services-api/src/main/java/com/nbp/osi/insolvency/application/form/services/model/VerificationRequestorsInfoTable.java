/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_osi_ver_request_detail&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see VerificationRequestorsInfo
 * @generated
 */
public class VerificationRequestorsInfoTable
	extends BaseTable<VerificationRequestorsInfoTable> {

	public static final VerificationRequestorsInfoTable INSTANCE =
		new VerificationRequestorsInfoTable();

	public final Column<VerificationRequestorsInfoTable, Long>
		requestorInformationId = createColumn(
			"requestorInformationId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<VerificationRequestorsInfoTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<VerificationRequestorsInfoTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<VerificationRequestorsInfoTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<VerificationRequestorsInfoTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<VerificationRequestorsInfoTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<VerificationRequestorsInfoTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<VerificationRequestorsInfoTable, String>
		verRequestorName = createColumn(
			"verRequestorName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<VerificationRequestorsInfoTable, String>
		verRequestorLastName = createColumn(
			"verRequestorLastName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<VerificationRequestorsInfoTable, String>
		verRequestorOccupation = createColumn(
			"verRequestorOccupation", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<VerificationRequestorsInfoTable, String>
		verRequestorAddress = createColumn(
			"verRequestorAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<VerificationRequestorsInfoTable, Date>
		verDateOfRequest = createColumn(
			"verDateOfRequest", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<VerificationRequestorsInfoTable, String>
		verRequestorTelNum = createColumn(
			"verRequestorTelNum", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<VerificationRequestorsInfoTable, String>
		verRequestorEmail = createColumn(
			"verRequestorEmail", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<VerificationRequestorsInfoTable, Long> osiInsolvencyId =
		createColumn(
			"osiInsolvencyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private VerificationRequestorsInfoTable() {
		super(
			"nbp_osi_ver_request_detail", VerificationRequestorsInfoTable::new);
	}

}