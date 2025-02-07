/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;nbp_osi_services_trus_in_decl&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesTrusteeDeclerationAndSignatureinfo
 * @generated
 */
public class OsiServicesTrusteeDeclerationAndSignatureinfoTable
	extends BaseTable<OsiServicesTrusteeDeclerationAndSignatureinfoTable> {

	public static final OsiServicesTrusteeDeclerationAndSignatureinfoTable
		INSTANCE = new OsiServicesTrusteeDeclerationAndSignatureinfoTable();

	public final Column
		<OsiServicesTrusteeDeclerationAndSignatureinfoTable, String> uuid =
			createColumn(
				"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column
		<OsiServicesTrusteeDeclerationAndSignatureinfoTable, Long>
			osiDeclerationId = createColumn(
				"osiDeclerationId", Long.class, Types.BIGINT,
				Column.FLAG_PRIMARY);
	public final Column
		<OsiServicesTrusteeDeclerationAndSignatureinfoTable, Long> groupId =
			createColumn(
				"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column
		<OsiServicesTrusteeDeclerationAndSignatureinfoTable, Long> companyId =
			createColumn(
				"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column
		<OsiServicesTrusteeDeclerationAndSignatureinfoTable, Long> userId =
			createColumn(
				"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column
		<OsiServicesTrusteeDeclerationAndSignatureinfoTable, String> userName =
			createColumn(
				"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column
		<OsiServicesTrusteeDeclerationAndSignatureinfoTable, Date> createDate =
			createColumn(
				"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column
		<OsiServicesTrusteeDeclerationAndSignatureinfoTable, Date>
			modifiedDate = createColumn(
				"modifiedDate", Date.class, Types.TIMESTAMP,
				Column.FLAG_DEFAULT);
	public final Column
		<OsiServicesTrusteeDeclerationAndSignatureinfoTable, String>
			indiUndersignedApplicantName = createColumn(
				"indiUndersignedApplicantName", String.class, Types.VARCHAR,
				Column.FLAG_DEFAULT);
	public final Column
		<OsiServicesTrusteeDeclerationAndSignatureinfoTable, Date>
			indiUndersignedDated = createColumn(
				"indiUndersignedDated", Date.class, Types.TIMESTAMP,
				Column.FLAG_DEFAULT);
	public final Column
		<OsiServicesTrusteeDeclerationAndSignatureinfoTable, Long>
			osiServicesApplicationId = createColumn(
				"osiServicesApplicationId", Long.class, Types.BIGINT,
				Column.FLAG_DEFAULT);

	private OsiServicesTrusteeDeclerationAndSignatureinfoTable() {
		super(
			"nbp_osi_services_trus_in_decl",
			OsiServicesTrusteeDeclerationAndSignatureinfoTable::new);
	}

}