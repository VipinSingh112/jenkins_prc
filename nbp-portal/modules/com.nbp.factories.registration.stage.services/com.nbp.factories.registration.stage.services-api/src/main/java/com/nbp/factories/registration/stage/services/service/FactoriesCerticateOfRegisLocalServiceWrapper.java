/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.stage.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link FactoriesCerticateOfRegisLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FactoriesCerticateOfRegisLocalService
 * @generated
 */
public class FactoriesCerticateOfRegisLocalServiceWrapper
	implements FactoriesCerticateOfRegisLocalService,
			   ServiceWrapper<FactoriesCerticateOfRegisLocalService> {

	public FactoriesCerticateOfRegisLocalServiceWrapper() {
		this(null);
	}

	public FactoriesCerticateOfRegisLocalServiceWrapper(
		FactoriesCerticateOfRegisLocalService
			factoriesCerticateOfRegisLocalService) {

		_factoriesCerticateOfRegisLocalService =
			factoriesCerticateOfRegisLocalService;
	}

	/**
	 * Adds the factories certicate of regis to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesCerticateOfRegisLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesCerticateOfRegis the factories certicate of regis
	 * @return the factories certicate of regis that was added
	 */
	@Override
	public com.nbp.factories.registration.stage.services.model.
		FactoriesCerticateOfRegis addFactoriesCerticateOfRegis(
			com.nbp.factories.registration.stage.services.model.
				FactoriesCerticateOfRegis factoriesCerticateOfRegis) {

		return _factoriesCerticateOfRegisLocalService.
			addFactoriesCerticateOfRegis(factoriesCerticateOfRegis);
	}

	/**
	 * Creates a new factories certicate of regis with the primary key. Does not add the factories certicate of regis to the database.
	 *
	 * @param factoriesCerticateOfRegisId the primary key for the new factories certicate of regis
	 * @return the new factories certicate of regis
	 */
	@Override
	public com.nbp.factories.registration.stage.services.model.
		FactoriesCerticateOfRegis createFactoriesCerticateOfRegis(
			long factoriesCerticateOfRegisId) {

		return _factoriesCerticateOfRegisLocalService.
			createFactoriesCerticateOfRegis(factoriesCerticateOfRegisId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _factoriesCerticateOfRegisLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the factories certicate of regis from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesCerticateOfRegisLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesCerticateOfRegis the factories certicate of regis
	 * @return the factories certicate of regis that was removed
	 */
	@Override
	public com.nbp.factories.registration.stage.services.model.
		FactoriesCerticateOfRegis deleteFactoriesCerticateOfRegis(
			com.nbp.factories.registration.stage.services.model.
				FactoriesCerticateOfRegis factoriesCerticateOfRegis) {

		return _factoriesCerticateOfRegisLocalService.
			deleteFactoriesCerticateOfRegis(factoriesCerticateOfRegis);
	}

	/**
	 * Deletes the factories certicate of regis with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesCerticateOfRegisLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesCerticateOfRegisId the primary key of the factories certicate of regis
	 * @return the factories certicate of regis that was removed
	 * @throws PortalException if a factories certicate of regis with the primary key could not be found
	 */
	@Override
	public com.nbp.factories.registration.stage.services.model.
		FactoriesCerticateOfRegis deleteFactoriesCerticateOfRegis(
				long factoriesCerticateOfRegisId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _factoriesCerticateOfRegisLocalService.
			deleteFactoriesCerticateOfRegis(factoriesCerticateOfRegisId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _factoriesCerticateOfRegisLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _factoriesCerticateOfRegisLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _factoriesCerticateOfRegisLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _factoriesCerticateOfRegisLocalService.dynamicQuery();
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

		return _factoriesCerticateOfRegisLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.factories.registration.stage.services.model.impl.FactoriesCerticateOfRegisModelImpl</code>.
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

		return _factoriesCerticateOfRegisLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.factories.registration.stage.services.model.impl.FactoriesCerticateOfRegisModelImpl</code>.
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

		return _factoriesCerticateOfRegisLocalService.dynamicQuery(
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

		return _factoriesCerticateOfRegisLocalService.dynamicQueryCount(
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

		return _factoriesCerticateOfRegisLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.factories.registration.stage.services.model.
		FactoriesCerticateOfRegis fetchFactoriesCerticateOfRegis(
			long factoriesCerticateOfRegisId) {

		return _factoriesCerticateOfRegisLocalService.
			fetchFactoriesCerticateOfRegis(factoriesCerticateOfRegisId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _factoriesCerticateOfRegisLocalService.
			getActionableDynamicQuery();
	}

	/**
	 * Returns the factories certicate of regis with the primary key.
	 *
	 * @param factoriesCerticateOfRegisId the primary key of the factories certicate of regis
	 * @return the factories certicate of regis
	 * @throws PortalException if a factories certicate of regis with the primary key could not be found
	 */
	@Override
	public com.nbp.factories.registration.stage.services.model.
		FactoriesCerticateOfRegis getFactoriesCerticateOfRegis(
				long factoriesCerticateOfRegisId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _factoriesCerticateOfRegisLocalService.
			getFactoriesCerticateOfRegis(factoriesCerticateOfRegisId);
	}

	/**
	 * Returns a range of all the factories certicate of regises.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.factories.registration.stage.services.model.impl.FactoriesCerticateOfRegisModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories certicate of regises
	 * @param end the upper bound of the range of factories certicate of regises (not inclusive)
	 * @return the range of factories certicate of regises
	 */
	@Override
	public java.util.List
		<com.nbp.factories.registration.stage.services.model.
			FactoriesCerticateOfRegis> getFactoriesCerticateOfRegises(
				int start, int end) {

		return _factoriesCerticateOfRegisLocalService.
			getFactoriesCerticateOfRegises(start, end);
	}

	/**
	 * Returns the number of factories certicate of regises.
	 *
	 * @return the number of factories certicate of regises
	 */
	@Override
	public int getFactoriesCerticateOfRegisesCount() {
		return _factoriesCerticateOfRegisLocalService.
			getFactoriesCerticateOfRegisesCount();
	}

	@Override
	public com.nbp.factories.registration.stage.services.model.
		FactoriesCerticateOfRegis getFactoryCertifiResgiBy_CI(String caseId)
			throws com.nbp.factories.registration.stage.services.exception.
				NoSuchFactoriesCerticateOfRegisException {

		return _factoriesCerticateOfRegisLocalService.
			getFactoryCertifiResgiBy_CI(caseId);
	}

	@Override
	public java.util.List
		<com.nbp.factories.registration.stage.services.model.
			FactoriesCerticateOfRegis> getFactoryCertifiResgisBy_CI(
				String caseId) {

		return _factoriesCerticateOfRegisLocalService.
			getFactoryCertifiResgisBy_CI(caseId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _factoriesCerticateOfRegisLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _factoriesCerticateOfRegisLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _factoriesCerticateOfRegisLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the factories certicate of regis in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesCerticateOfRegisLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesCerticateOfRegis the factories certicate of regis
	 * @return the factories certicate of regis that was updated
	 */
	@Override
	public com.nbp.factories.registration.stage.services.model.
		FactoriesCerticateOfRegis updateFactoriesCerticateOfRegis(
			com.nbp.factories.registration.stage.services.model.
				FactoriesCerticateOfRegis factoriesCerticateOfRegis) {

		return _factoriesCerticateOfRegisLocalService.
			updateFactoriesCerticateOfRegis(factoriesCerticateOfRegis);
	}

	@Override
	public com.nbp.factories.registration.stage.services.model.
		FactoriesCerticateOfRegis updateFactoriesCertificateOfRegistration(
			String caseId, String nameOfEstablishment, String parish,
			String procuctCatAndName, java.util.Date certificateIssueDate,
			java.util.Date dateOfExpiration, String registration,
			String status) {

		return _factoriesCerticateOfRegisLocalService.
			updateFactoriesCertificateOfRegistration(
				caseId, nameOfEstablishment, parish, procuctCatAndName,
				certificateIssueDate, dateOfExpiration, registration, status);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _factoriesCerticateOfRegisLocalService.getBasePersistence();
	}

	@Override
	public FactoriesCerticateOfRegisLocalService getWrappedService() {
		return _factoriesCerticateOfRegisLocalService;
	}

	@Override
	public void setWrappedService(
		FactoriesCerticateOfRegisLocalService
			factoriesCerticateOfRegisLocalService) {

		_factoriesCerticateOfRegisLocalService =
			factoriesCerticateOfRegisLocalService;
	}

	private FactoriesCerticateOfRegisLocalService
		_factoriesCerticateOfRegisLocalService;

}