/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the QuarryTransferApplicantInfo service. Represents a row in the &quot;nbp_quarry_transfer_info&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see QuarryTransferApplicantInfoModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.quary.application.form.service.model.impl.QuarryTransferApplicantInfoImpl"
)
@ProviderType
public interface QuarryTransferApplicantInfo
	extends PersistedModel, QuarryTransferApplicantInfoModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.quary.application.form.service.model.impl.QuarryTransferApplicantInfoImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<QuarryTransferApplicantInfo, Long>
		QUARRY_TRANSFER_INFO_ID_ACCESSOR =
			new Accessor<QuarryTransferApplicantInfo, Long>() {

				@Override
				public Long get(
					QuarryTransferApplicantInfo quarryTransferApplicantInfo) {

					return quarryTransferApplicantInfo.
						getQuarryTransferInfoId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<QuarryTransferApplicantInfo> getTypeClass() {
					return QuarryTransferApplicantInfo.class;
				}

			};

}