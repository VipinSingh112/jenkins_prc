/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.stages.services.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the NcraApplicationStages service. Represents a row in the &quot;nbp_ncra_stage_appli&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see NcraApplicationStagesModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.ncra.stages.services.model.impl.NcraApplicationStagesImpl"
)
@ProviderType
public interface NcraApplicationStages
	extends NcraApplicationStagesModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.ncra.stages.services.model.impl.NcraApplicationStagesImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<NcraApplicationStages, Long>
		NCRA_APPLCIATION_STAGE_ACCESSOR =
			new Accessor<NcraApplicationStages, Long>() {

				@Override
				public Long get(NcraApplicationStages ncraApplicationStages) {
					return ncraApplicationStages.getNcraApplciationStage();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<NcraApplicationStages> getTypeClass() {
					return NcraApplicationStages.class;
				}

			};

}