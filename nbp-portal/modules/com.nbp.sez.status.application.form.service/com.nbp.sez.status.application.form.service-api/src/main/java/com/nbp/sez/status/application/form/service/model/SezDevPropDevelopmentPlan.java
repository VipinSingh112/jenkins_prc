/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the SezDevPropDevelopmentPlan service. Represents a row in the &quot;nbp_sez_dev_Pro_develop_plan&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see SezDevPropDevelopmentPlanModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.sez.status.application.form.service.model.impl.SezDevPropDevelopmentPlanImpl"
)
@ProviderType
public interface SezDevPropDevelopmentPlan
	extends PersistedModel, SezDevPropDevelopmentPlanModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.sez.status.application.form.service.model.impl.SezDevPropDevelopmentPlanImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<SezDevPropDevelopmentPlan, Long>
		SEZ_DEV_PROP_DEVELOPMENT_PLAN_ID_ACCESSOR =
			new Accessor<SezDevPropDevelopmentPlan, Long>() {

				@Override
				public Long get(
					SezDevPropDevelopmentPlan sezDevPropDevelopmentPlan) {

					return sezDevPropDevelopmentPlan.
						getSezDevPropDevelopmentPlanId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<SezDevPropDevelopmentPlan> getTypeClass() {
					return SezDevPropDevelopmentPlan.class;
				}

			};

}