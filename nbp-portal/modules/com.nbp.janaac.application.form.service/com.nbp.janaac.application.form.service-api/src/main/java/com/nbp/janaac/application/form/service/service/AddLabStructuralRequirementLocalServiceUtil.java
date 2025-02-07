/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.janaac.application.form.service.model.AddLabStructuralRequirement;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for AddLabStructuralRequirement. This utility wraps
 * <code>com.nbp.janaac.application.form.service.service.impl.AddLabStructuralRequirementLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see AddLabStructuralRequirementLocalService
 * @generated
 */
public class AddLabStructuralRequirementLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.janaac.application.form.service.service.impl.AddLabStructuralRequirementLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the add lab structural requirement to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddLabStructuralRequirementLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addLabStructuralRequirement the add lab structural requirement
	 * @return the add lab structural requirement that was added
	 */
	public static AddLabStructuralRequirement addAddLabStructuralRequirement(
		AddLabStructuralRequirement addLabStructuralRequirement) {

		return getService().addAddLabStructuralRequirement(
			addLabStructuralRequirement);
	}

	/**
	 * Creates a new add lab structural requirement with the primary key. Does not add the add lab structural requirement to the database.
	 *
	 * @param addLabStructuralRequirementId the primary key for the new add lab structural requirement
	 * @return the new add lab structural requirement
	 */
	public static AddLabStructuralRequirement createAddLabStructuralRequirement(
		long addLabStructuralRequirementId) {

		return getService().createAddLabStructuralRequirement(
			addLabStructuralRequirementId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the add lab structural requirement from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddLabStructuralRequirementLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addLabStructuralRequirement the add lab structural requirement
	 * @return the add lab structural requirement that was removed
	 */
	public static AddLabStructuralRequirement deleteAddLabStructuralRequirement(
		AddLabStructuralRequirement addLabStructuralRequirement) {

		return getService().deleteAddLabStructuralRequirement(
			addLabStructuralRequirement);
	}

	/**
	 * Deletes the add lab structural requirement with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddLabStructuralRequirementLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addLabStructuralRequirementId the primary key of the add lab structural requirement
	 * @return the add lab structural requirement that was removed
	 * @throws PortalException if a add lab structural requirement with the primary key could not be found
	 */
	public static AddLabStructuralRequirement deleteAddLabStructuralRequirement(
			long addLabStructuralRequirementId)
		throws PortalException {

		return getService().deleteAddLabStructuralRequirement(
			addLabStructuralRequirementId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static <T> T dslQuery(DSLQuery dslQuery) {
		return getService().dslQuery(dslQuery);
	}

	public static int dslQueryCount(DSLQuery dslQuery) {
		return getService().dslQueryCount(dslQuery);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddLabStructuralRequirementModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddLabStructuralRequirementModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static AddLabStructuralRequirement fetchAddLabStructuralRequirement(
		long addLabStructuralRequirementId) {

		return getService().fetchAddLabStructuralRequirement(
			addLabStructuralRequirementId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the add lab structural requirement with the primary key.
	 *
	 * @param addLabStructuralRequirementId the primary key of the add lab structural requirement
	 * @return the add lab structural requirement
	 * @throws PortalException if a add lab structural requirement with the primary key could not be found
	 */
	public static AddLabStructuralRequirement getAddLabStructuralRequirement(
			long addLabStructuralRequirementId)
		throws PortalException {

		return getService().getAddLabStructuralRequirement(
			addLabStructuralRequirementId);
	}

	/**
	 * Returns a range of all the add lab structural requirements.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddLabStructuralRequirementModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab structural requirements
	 * @param end the upper bound of the range of add lab structural requirements (not inclusive)
	 * @return the range of add lab structural requirements
	 */
	public static List<AddLabStructuralRequirement>
		getAddLabStructuralRequirements(int start, int end) {

		return getService().getAddLabStructuralRequirements(start, end);
	}

	/**
	 * Returns the number of add lab structural requirements.
	 *
	 * @return the number of add lab structural requirements
	 */
	public static int getAddLabStructuralRequirementsCount() {
		return getService().getAddLabStructuralRequirementsCount();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	public static List<AddLabStructuralRequirement> getJanaacById(
		long janaacApplicationId) {

		return getService().getJanaacById(janaacApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the add lab structural requirement in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddLabStructuralRequirementLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addLabStructuralRequirement the add lab structural requirement
	 * @return the add lab structural requirement that was updated
	 */
	public static AddLabStructuralRequirement updateAddLabStructuralRequirement(
		AddLabStructuralRequirement addLabStructuralRequirement) {

		return getService().updateAddLabStructuralRequirement(
			addLabStructuralRequirement);
	}

	public static AddLabStructuralRequirementLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<AddLabStructuralRequirementLocalService>
		_serviceSnapshot = new Snapshot<>(
			AddLabStructuralRequirementLocalServiceUtil.class,
			AddLabStructuralRequirementLocalService.class);

}