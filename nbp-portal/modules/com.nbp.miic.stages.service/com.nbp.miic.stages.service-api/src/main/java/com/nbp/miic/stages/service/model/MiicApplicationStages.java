/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.stages.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the MiicApplicationStages service. Represents a row in the &quot;nbp_miic_stage&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see MiicApplicationStagesModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.miic.stages.service.model.impl.MiicApplicationStagesImpl"
)
@ProviderType
public interface MiicApplicationStages
	extends MiicApplicationStagesModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.miic.stages.service.model.impl.MiicApplicationStagesImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<MiicApplicationStages, Long>
		MIIC_APPLICATION_STAGES_ID_ACCESSOR =
			new Accessor<MiicApplicationStages, Long>() {

				@Override
				public Long get(MiicApplicationStages miicApplicationStages) {
					return miicApplicationStages.getMiicApplicationStagesId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<MiicApplicationStages> getTypeClass() {
					return MiicApplicationStages.class;
				}

			};

}