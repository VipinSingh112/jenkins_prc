/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.lease.application.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the MiningExclusiveLicFormFive service. Represents a row in the &quot;nbp_exclusive_form_five&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see MiningExclusiveLicFormFiveModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.mining.lease.application.service.model.impl.MiningExclusiveLicFormFiveImpl"
)
@ProviderType
public interface MiningExclusiveLicFormFive
	extends MiningExclusiveLicFormFiveModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.mining.lease.application.service.model.impl.MiningExclusiveLicFormFiveImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<MiningExclusiveLicFormFive, Long>
		MINING_EXCLUSIVE_LIC_FORM_FIVE_ID_ACCESSOR =
			new Accessor<MiningExclusiveLicFormFive, Long>() {

				@Override
				public Long get(
					MiningExclusiveLicFormFive miningExclusiveLicFormFive) {

					return miningExclusiveLicFormFive.
						getMiningExclusiveLicFormFiveId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<MiningExclusiveLicFormFive> getTypeClass() {
					return MiningExclusiveLicFormFive.class;
				}

			};

}