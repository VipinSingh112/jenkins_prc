/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
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
 * @see VerificationRequestorsInformation
 * @generated
 */
public class VerificationRequestorsInformationTable
	extends BaseTable<VerificationRequestorsInformationTable> {

	public static final VerificationRequestorsInformationTable INSTANCE =
		new VerificationRequestorsInformationTable();

	public final Column<VerificationRequestorsInformationTable, Long>
		requestorInformationId = createColumn(
			"requestorInformationId", Long.class, Types.BIGINT,
			Column.FLAG_PRIMARY);
	public final Column<VerificationRequestorsInformationTable, Long> groupId =
		createColumn("groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<VerificationRequestorsInformationTable, Long>
		companyId = createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<VerificationRequestorsInformationTable, Long> userId =
		createColumn("userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<VerificationRequestorsInformationTable, String>
		userName = createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<VerificationRequestorsInformationTable, Date>
		createDate = createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<VerificationRequestorsInformationTable, Date>
		modifiedDate = createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<VerificationRequestorsInformationTable, String>
		verRequestorName = createColumn(
			"verRequestorName", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<VerificationRequestorsInformationTable, String>
		verRequestorOccupation = createColumn(
			"verRequestorOccupation", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<VerificationRequestorsInformationTable, String>
		verRequestorAddress = createColumn(
			"verRequestorAddress", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<VerificationRequestorsInformationTable, Date>
		verDateOfRequest = createColumn(
			"verDateOfRequest", Date.class, Types.TIMESTAMP,
			Column.FLAG_DEFAULT);
	public final Column<VerificationRequestorsInformationTable, String>
		verRequestorTelNum = createColumn(
			"verRequestorTelNum", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<VerificationRequestorsInformationTable, String>
		verRequestorEmail = createColumn(
			"verRequestorEmail", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<VerificationRequestorsInformationTable, Long>
		osiInsolvencyId = createColumn(
			"osiInsolvencyId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);

	private VerificationRequestorsInformationTable() {
		super(
			"nbp_osi_ver_request_detail",
			VerificationRequestorsInformationTable::new);
	}

}