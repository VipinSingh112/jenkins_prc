/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link FactoriesApplicationRegistrationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FactoriesApplicationRegistrationLocalService
 * @generated
 */
public class FactoriesApplicationRegistrationLocalServiceWrapper
	implements FactoriesApplicationRegistrationLocalService,
			   ServiceWrapper<FactoriesApplicationRegistrationLocalService> {

	public FactoriesApplicationRegistrationLocalServiceWrapper() {
		this(null);
	}

	public FactoriesApplicationRegistrationLocalServiceWrapper(
		FactoriesApplicationRegistrationLocalService
			factoriesApplicationRegistrationLocalService) {

		_factoriesApplicationRegistrationLocalService =
			factoriesApplicationRegistrationLocalService;
	}

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
	@Override
	public com.nbp.factories.registration.application.form.services.model.
		FactoriesApplicationRegistration addFactoriesApplicationRegistration(
			com.nbp.factories.registration.application.form.services.model.
				FactoriesApplicationRegistration
					factoriesApplicationRegistration) {

		return _factoriesApplicationRegistrationLocalService.
			addFactoriesApplicationRegistration(
				factoriesApplicationRegistration);
	}

	/**
	 * Creates a new factories application registration with the primary key. Does not add the factories application registration to the database.
	 *
	 * @param factoriesApplicationId the primary key for the new factories application registration
	 * @return the new factories application registration
	 */
	@Override
	public com.nbp.factories.registration.application.form.services.model.
		FactoriesApplicationRegistration createFactoriesApplicationRegistration(
			long factoriesApplicationId) {

		return _factoriesApplicationRegistrationLocalService.
			createFactoriesApplicationRegistration(factoriesApplicationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _factoriesApplicationRegistrationLocalService.
			createPersistedModel(primaryKeyObj);
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
	@Override
	public com.nbp.factories.registration.application.form.services.model.
		FactoriesApplicationRegistration deleteFactoriesApplicationRegistration(
			com.nbp.factories.registration.application.form.services.model.
				FactoriesApplicationRegistration
					factoriesApplicationRegistration) {

		return _factoriesApplicationRegistrationLocalService.
			deleteFactoriesApplicationRegistration(
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
	@Override
	public com.nbp.factories.registration.application.form.services.model.
		FactoriesApplicationRegistration deleteFactoriesApplicationRegistration(
				long factoriesApplicationId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _factoriesApplicationRegistrationLocalService.
			deleteFactoriesApplicationRegistration(factoriesApplicationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _factoriesApplicationRegistrationLocalService.
			deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _factoriesApplicationRegistrationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _factoriesApplicationRegistrationLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _factoriesApplicationRegistrationLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _factoriesApplicationRegistrationLocalService.dynamicQuery(
			dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _factoriesApplicationRegistrationLocalService.dynamicQuery(
			dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _factoriesApplicationRegistrationLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _factoriesApplicationRegistrationLocalService.dynamicQueryCount(
			dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _factoriesApplicationRegistrationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.factories.registration.application.form.services.model.
		FactoriesApplicationRegistration fetchFactoriesApplicationRegistration(
			long factoriesApplicationId) {

		return _factoriesApplicationRegistrationLocalService.
			fetchFactoriesApplicationRegistration(factoriesApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _factoriesApplicationRegistrationLocalService.
			getActionableDynamicQuery();
	}

	/**
	 * Returns the factories application registration with the primary key.
	 *
	 * @param factoriesApplicationId the primary key of the factories application registration
	 * @return the factories application registration
	 * @throws PortalException if a factories application registration with the primary key could not be found
	 */
	@Override
	public com.nbp.factories.registration.application.form.services.model.
		FactoriesApplicationRegistration getFactoriesApplicationRegistration(
				long factoriesApplicationId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _factoriesApplicationRegistrationLocalService.
			getFactoriesApplicationRegistration(factoriesApplicationId);
	}

	@Override
	public java.util.List
		<com.nbp.factories.registration.application.form.services.model.
			FactoriesApplicationRegistration>
				getFactoriesApplicationRegistrationByStatus_UserId(
					int status, long userId) {

		return _factoriesApplicationRegistrationLocalService.
			getFactoriesApplicationRegistrationByStatus_UserId(status, userId);
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
	@Override
	public java.util.List
		<com.nbp.factories.registration.application.form.services.model.
			FactoriesApplicationRegistration>
				getFactoriesApplicationRegistrations(int start, int end) {

		return _factoriesApplicationRegistrationLocalService.
			getFactoriesApplicationRegistrations(start, end);
	}

	/**
	 * Returns the number of factories application registrations.
	 *
	 * @return the number of factories application registrations
	 */
	@Override
	public int getFactoriesApplicationRegistrationsCount() {
		return _factoriesApplicationRegistrationLocalService.
			getFactoriesApplicationRegistrationsCount();
	}

	@Override
	public java.util.List<String> getFactoriesDistinctCategories() {
		return _factoriesApplicationRegistrationLocalService.
			getFactoriesDistinctCategories();
	}

	@Override
	public com.nbp.factories.registration.application.form.services.model.
		FactoriesApplicationRegistration getFactoriesRegistrationById(
				long factoriesApplicationId)
			throws com.nbp.factories.registration.application.form.services.
				exception.NoSuchFactoriesApplicationRegistrationException {

		return _factoriesApplicationRegistrationLocalService.
			getFactoriesRegistrationById(factoriesApplicationId);
	}

	@Override
	public com.nbp.factories.registration.application.form.services.model.
		FactoriesApplicationRegistration getFactoriesRegstBy_AppNo(
				String applicationNumber)
			throws com.nbp.factories.registration.application.form.services.
				exception.NoSuchFactoriesApplicationRegistrationException {

		return _factoriesApplicationRegistrationLocalService.
			getFactoriesRegstBy_AppNo(applicationNumber);
	}

	@Override
	public com.nbp.factories.registration.application.form.services.model.
		FactoriesApplicationRegistration getFactoriesRegstBy_CaseId(
				String caseId)
			throws com.nbp.factories.registration.application.form.services.
				exception.NoSuchFactoriesApplicationRegistrationException {

		return _factoriesApplicationRegistrationLocalService.
			getFactoriesRegstBy_CaseId(caseId);
	}

	@Override
	public com.nbp.factories.registration.application.form.services.model.
		FactoriesApplicationRegistration getFactoriesRegstByAT_AppNo(
				String typeOfTransaction, String expiredLicenseAppNumber)
			throws com.nbp.factories.registration.application.form.services.
				exception.NoSuchFactoriesApplicationRegistrationException {

		return _factoriesApplicationRegistrationLocalService.
			getFactoriesRegstByAT_AppNo(
				typeOfTransaction, expiredLicenseAppNumber);
	}

	@Override
	public java.util.List
		<com.nbp.factories.registration.application.form.services.model.
			FactoriesApplicationRegistration> getFactoriesRegstByS_U(
				long userId, int status) {

		return _factoriesApplicationRegistrationLocalService.
			getFactoriesRegstByS_U(userId, status);
	}

	@Override
	public java.util.List
		<com.nbp.factories.registration.application.form.services.model.
			FactoriesApplicationRegistration> getFactoriesRegstByStatus(
				int status) {

		return _factoriesApplicationRegistrationLocalService.
			getFactoriesRegstByStatus(status);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _factoriesApplicationRegistrationLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _factoriesApplicationRegistrationLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _factoriesApplicationRegistrationLocalService.getPersistedModel(
			primaryKeyObj);
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
	@Override
	public com.nbp.factories.registration.application.form.services.model.
		FactoriesApplicationRegistration updateFactoriesApplicationRegistration(
			com.nbp.factories.registration.application.form.services.model.
				FactoriesApplicationRegistration
					factoriesApplicationRegistration) {

		return _factoriesApplicationRegistrationLocalService.
			updateFactoriesApplicationRegistration(
				factoriesApplicationRegistration);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _factoriesApplicationRegistrationLocalService.
			getBasePersistence();
	}

	@Override
	public FactoriesApplicationRegistrationLocalService getWrappedService() {
		return _factoriesApplicationRegistrationLocalService;
	}

	@Override
	public void setWrappedService(
		FactoriesApplicationRegistrationLocalService
			factoriesApplicationRegistrationLocalService) {

		_factoriesApplicationRegistrationLocalService =
			factoriesApplicationRegistrationLocalService;
	}

	private FactoriesApplicationRegistrationLocalService
		_factoriesApplicationRegistrationLocalService;

}