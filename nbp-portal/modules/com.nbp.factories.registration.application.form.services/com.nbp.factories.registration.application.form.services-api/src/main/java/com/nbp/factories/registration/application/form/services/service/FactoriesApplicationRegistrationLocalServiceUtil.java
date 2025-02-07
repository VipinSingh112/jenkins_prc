/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.application.form.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.factories.registration.application.form.services.model.FactoriesApplicationRegistration;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for FactoriesApplicationRegistration. This utility wraps
 * <code>com.nbp.factories.registration.application.form.services.service.impl.FactoriesApplicationRegistrationLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see FactoriesApplicationRegistrationLocalService
 * @generated
 */
public class FactoriesApplicationRegistrationLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.factories.registration.application.form.services.service.impl.FactoriesApplicationRegistrationLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the factories application registration to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesApplicationRegistrationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesApplicationRegistration the factories application registration
	 * @return the factories application registration that was added
	 */
	public static FactoriesApplicationRegistration
		addFactoriesApplicationRegistration(
			FactoriesApplicationRegistration factoriesApplicationRegistration) {

		return getService().addFactoriesApplicationRegistration(
			factoriesApplicationRegistration);
	}

	/**
	 * Creates a new factories application registration with the primary key. Does not add the factories application registration to the database.
	 *
	 * @param factoriesApplicationId the primary key for the new factories application registration
	 * @return the new factories application registration
	 */
	public static FactoriesApplicationRegistration
		createFactoriesApplicationRegistration(long factoriesApplicationId) {

		return getService().createFactoriesApplicationRegistration(
			factoriesApplicationId);
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
	 * Deletes the factories application registration from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesApplicationRegistrationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesApplicationRegistration the factories application registration
	 * @return the factories application registration that was removed
	 */
	public static FactoriesApplicationRegistration
		deleteFactoriesApplicationRegistration(
			FactoriesApplicationRegistration factoriesApplicationRegistration) {

		return getService().deleteFactoriesApplicationRegistration(
			factoriesApplicationRegistration);
	}

	/**
	 * Deletes the factories application registration with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesApplicationRegistrationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesApplicationId the primary key of the factories application registration
	 * @return the factories application registration that was removed
	 * @throws PortalException if a factories application registration with the primary key could not be found
	 */
	public static FactoriesApplicationRegistration
			deleteFactoriesApplicationRegistration(long factoriesApplicationId)
		throws PortalException {

		return getService().deleteFactoriesApplicationRegistration(
			factoriesApplicationId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.factories.registration.application.form.services.model.impl.FactoriesApplicationRegistrationModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.factories.registration.application.form.services.model.impl.FactoriesApplicationRegistrationModelImpl</code>.
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

	public static FactoriesApplicationRegistration
		fetchFactoriesApplicationRegistration(long factoriesApplicationId) {

		return getService().fetchFactoriesApplicationRegistration(
			factoriesApplicationId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the factories application registration with the primary key.
	 *
	 * @param factoriesApplicationId the primary key of the factories application registration
	 * @return the factories application registration
	 * @throws PortalException if a factories application registration with the primary key could not be found
	 */
	public static FactoriesApplicationRegistration
			getFactoriesApplicationRegistration(long factoriesApplicationId)
		throws PortalException {

		return getService().getFactoriesApplicationRegistration(
			factoriesApplicationId);
	}

	public static List<FactoriesApplicationRegistration>
		getFactoriesApplicationRegistrationByStatus_UserId(
			int status, long userId) {

		return getService().getFactoriesApplicationRegistrationByStatus_UserId(
			status, userId);
	}

	/**
	 * Returns a range of all the factories application registrations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.factories.registration.application.form.services.model.impl.FactoriesApplicationRegistrationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories application registrations
	 * @param end the upper bound of the range of factories application registrations (not inclusive)
	 * @return the range of factories application registrations
	 */
	public static List<FactoriesApplicationRegistration>
		getFactoriesApplicationRegistrations(int start, int end) {

		return getService().getFactoriesApplicationRegistrations(start, end);
	}

	/**
	 * Returns the number of factories application registrations.
	 *
	 * @return the number of factories application registrations
	 */
	public static int getFactoriesApplicationRegistrationsCount() {
		return getService().getFactoriesApplicationRegistrationsCount();
	}

	public static List<String> getFactoriesDistinctCategories() {
		return getService().getFactoriesDistinctCategories();
	}

	public static FactoriesApplicationRegistration getFactoriesRegistrationById(
			long factoriesApplicationId)
		throws com.nbp.factories.registration.application.form.services.
			exception.NoSuchFactoriesApplicationRegistrationException {

		return getService().getFactoriesRegistrationById(
			factoriesApplicationId);
	}

	public static FactoriesApplicationRegistration getFactoriesRegstBy_AppNo(
			String applicationNumber)
		throws com.nbp.factories.registration.application.form.services.
			exception.NoSuchFactoriesApplicationRegistrationException {

		return getService().getFactoriesRegstBy_AppNo(applicationNumber);
	}

	public static FactoriesApplicationRegistration getFactoriesRegstBy_CaseId(
			String caseId)
		throws com.nbp.factories.registration.application.form.services.
			exception.NoSuchFactoriesApplicationRegistrationException {

		return getService().getFactoriesRegstBy_CaseId(caseId);
	}

	public static FactoriesApplicationRegistration getFactoriesRegstByAT_AppNo(
			String typeOfTransaction, String expiredLicenseAppNumber)
		throws com.nbp.factories.registration.application.form.services.
			exception.NoSuchFactoriesApplicationRegistrationException {

		return getService().getFactoriesRegstByAT_AppNo(
			typeOfTransaction, expiredLicenseAppNumber);
	}

	public static List<FactoriesApplicationRegistration> getFactoriesRegstByS_U(
		long userId, int status) {

		return getService().getFactoriesRegstByS_U(userId, status);
	}

	public static List<FactoriesApplicationRegistration>
		getFactoriesRegstByStatus(int status) {

		return getService().getFactoriesRegstByStatus(status);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
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
	 * Updates the factories application registration in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesApplicationRegistrationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesApplicationRegistration the factories application registration
	 * @return the factories application registration that was updated
	 */
	public static FactoriesApplicationRegistration
		updateFactoriesApplicationRegistration(
			FactoriesApplicationRegistration factoriesApplicationRegistration) {

		return getService().updateFactoriesApplicationRegistration(
			factoriesApplicationRegistration);
	}

	public static FactoriesApplicationRegistrationLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<FactoriesApplicationRegistrationLocalService>
		_serviceSnapshot = new Snapshot<>(
			FactoriesApplicationRegistrationLocalServiceUtil.class,
			FactoriesApplicationRegistrationLocalService.class);

}