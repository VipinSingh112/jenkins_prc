/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link CannabisLicenseLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisLicenseLocalService
 * @generated
 */
public class CannabisLicenseLocalServiceWrapper
	implements CannabisLicenseLocalService,
			   ServiceWrapper<CannabisLicenseLocalService> {

	public CannabisLicenseLocalServiceWrapper() {
		this(null);
	}

	public CannabisLicenseLocalServiceWrapper(
		CannabisLicenseLocalService cannabisLicenseLocalService) {

		_cannabisLicenseLocalService = cannabisLicenseLocalService;
	}

	/**
	 * Adds the cannabis license to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisLicenseLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisLicense the cannabis license
	 * @return the cannabis license that was added
	 */
	@Override
	public com.npm.cannabis.application.stages.services.model.CannabisLicense
		addCannabisLicense(
			com.npm.cannabis.application.stages.services.model.CannabisLicense
				cannabisLicense) {

		return _cannabisLicenseLocalService.addCannabisLicense(cannabisLicense);
	}

	/**
	 * Creates a new cannabis license with the primary key. Does not add the cannabis license to the database.
	 *
	 * @param cannabisLicenseId the primary key for the new cannabis license
	 * @return the new cannabis license
	 */
	@Override
	public com.npm.cannabis.application.stages.services.model.CannabisLicense
		createCannabisLicense(long cannabisLicenseId) {

		return _cannabisLicenseLocalService.createCannabisLicense(
			cannabisLicenseId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisLicenseLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the cannabis license from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisLicenseLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisLicense the cannabis license
	 * @return the cannabis license that was removed
	 */
	@Override
	public com.npm.cannabis.application.stages.services.model.CannabisLicense
		deleteCannabisLicense(
			com.npm.cannabis.application.stages.services.model.CannabisLicense
				cannabisLicense) {

		return _cannabisLicenseLocalService.deleteCannabisLicense(
			cannabisLicense);
	}

	/**
	 * Deletes the cannabis license with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisLicenseLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisLicenseId the primary key of the cannabis license
	 * @return the cannabis license that was removed
	 * @throws PortalException if a cannabis license with the primary key could not be found
	 */
	@Override
	public com.npm.cannabis.application.stages.services.model.CannabisLicense
			deleteCannabisLicense(long cannabisLicenseId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisLicenseLocalService.deleteCannabisLicense(
			cannabisLicenseId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisLicenseLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _cannabisLicenseLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _cannabisLicenseLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _cannabisLicenseLocalService.dynamicQuery();
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

		return _cannabisLicenseLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.npm.cannabis.application.stages.services.model.impl.CannabisLicenseModelImpl</code>.
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

		return _cannabisLicenseLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.npm.cannabis.application.stages.services.model.impl.CannabisLicenseModelImpl</code>.
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

		return _cannabisLicenseLocalService.dynamicQuery(
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

		return _cannabisLicenseLocalService.dynamicQueryCount(dynamicQuery);
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

		return _cannabisLicenseLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.npm.cannabis.application.stages.services.model.CannabisLicense
		fetchCannabisLicense(long cannabisLicenseId) {

		return _cannabisLicenseLocalService.fetchCannabisLicense(
			cannabisLicenseId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _cannabisLicenseLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the cannabis license with the primary key.
	 *
	 * @param cannabisLicenseId the primary key of the cannabis license
	 * @return the cannabis license
	 * @throws PortalException if a cannabis license with the primary key could not be found
	 */
	@Override
	public com.npm.cannabis.application.stages.services.model.CannabisLicense
			getCannabisLicense(long cannabisLicenseId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisLicenseLocalService.getCannabisLicense(
			cannabisLicenseId);
	}

	@Override
	public com.npm.cannabis.application.stages.services.model.CannabisLicense
		getCannabisLicenseBy_LN(String licenseNumber) {

		return _cannabisLicenseLocalService.getCannabisLicenseBy_LN(
			licenseNumber);
	}

	@Override
	public com.npm.cannabis.application.stages.services.model.CannabisLicense
		getCannabisLicenseByCaseId(String caseId) {

		return _cannabisLicenseLocalService.getCannabisLicenseByCaseId(caseId);
	}

	/**
	 * Returns a range of all the cannabis licenses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.npm.cannabis.application.stages.services.model.impl.CannabisLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis licenses
	 * @param end the upper bound of the range of cannabis licenses (not inclusive)
	 * @return the range of cannabis licenses
	 */
	@Override
	public java.util.List
		<com.npm.cannabis.application.stages.services.model.CannabisLicense>
			getCannabisLicenses(int start, int end) {

		return _cannabisLicenseLocalService.getCannabisLicenses(start, end);
	}

	/**
	 * Returns the number of cannabis licenses.
	 *
	 * @return the number of cannabis licenses
	 */
	@Override
	public int getCannabisLicensesCount() {
		return _cannabisLicenseLocalService.getCannabisLicensesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _cannabisLicenseLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _cannabisLicenseLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisLicenseLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the cannabis license in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisLicenseLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisLicense the cannabis license
	 * @return the cannabis license that was updated
	 */
	@Override
	public com.npm.cannabis.application.stages.services.model.CannabisLicense
		updateCannabisLicense(
			com.npm.cannabis.application.stages.services.model.CannabisLicense
				cannabisLicense) {

		return _cannabisLicenseLocalService.updateCannabisLicense(
			cannabisLicense);
	}

	@Override
	public com.npm.cannabis.application.stages.services.model.CannabisLicense
		updateCannabisLicenseInfo(
			String caseId, java.util.Date expirationDate,
			java.util.Date issueDate, String licenseCondtions,
			String nameOfBPMStep, String payentAmtDue, String licenseNumber) {

		return _cannabisLicenseLocalService.updateCannabisLicenseInfo(
			caseId, expirationDate, issueDate, licenseCondtions, nameOfBPMStep,
			payentAmtDue, licenseNumber);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _cannabisLicenseLocalService.getBasePersistence();
	}

	@Override
	public CannabisLicenseLocalService getWrappedService() {
		return _cannabisLicenseLocalService;
	}

	@Override
	public void setWrappedService(
		CannabisLicenseLocalService cannabisLicenseLocalService) {

		_cannabisLicenseLocalService = cannabisLicenseLocalService;
	}

	private CannabisLicenseLocalService _cannabisLicenseLocalService;

}