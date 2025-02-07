/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link CannabisConditionalLicenseLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisConditionalLicenseLocalService
 * @generated
 */
public class CannabisConditionalLicenseLocalServiceWrapper
	implements CannabisConditionalLicenseLocalService,
			   ServiceWrapper<CannabisConditionalLicenseLocalService> {

	public CannabisConditionalLicenseLocalServiceWrapper() {
		this(null);
	}

	public CannabisConditionalLicenseLocalServiceWrapper(
		CannabisConditionalLicenseLocalService
			cannabisConditionalLicenseLocalService) {

		_cannabisConditionalLicenseLocalService =
			cannabisConditionalLicenseLocalService;
	}

	/**
	 * Adds the cannabis conditional license to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisConditionalLicenseLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisConditionalLicense the cannabis conditional license
	 * @return the cannabis conditional license that was added
	 */
	@Override
	public com.npm.cannabis.application.stages.services.model.
		CannabisConditionalLicense addCannabisConditionalLicense(
			com.npm.cannabis.application.stages.services.model.
				CannabisConditionalLicense cannabisConditionalLicense) {

		return _cannabisConditionalLicenseLocalService.
			addCannabisConditionalLicense(cannabisConditionalLicense);
	}

	/**
	 * Creates a new cannabis conditional license with the primary key. Does not add the cannabis conditional license to the database.
	 *
	 * @param cannabisConditonalLicenseId the primary key for the new cannabis conditional license
	 * @return the new cannabis conditional license
	 */
	@Override
	public com.npm.cannabis.application.stages.services.model.
		CannabisConditionalLicense createCannabisConditionalLicense(
			long cannabisConditonalLicenseId) {

		return _cannabisConditionalLicenseLocalService.
			createCannabisConditionalLicense(cannabisConditonalLicenseId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisConditionalLicenseLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the cannabis conditional license from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisConditionalLicenseLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisConditionalLicense the cannabis conditional license
	 * @return the cannabis conditional license that was removed
	 */
	@Override
	public com.npm.cannabis.application.stages.services.model.
		CannabisConditionalLicense deleteCannabisConditionalLicense(
			com.npm.cannabis.application.stages.services.model.
				CannabisConditionalLicense cannabisConditionalLicense) {

		return _cannabisConditionalLicenseLocalService.
			deleteCannabisConditionalLicense(cannabisConditionalLicense);
	}

	/**
	 * Deletes the cannabis conditional license with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisConditionalLicenseLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisConditonalLicenseId the primary key of the cannabis conditional license
	 * @return the cannabis conditional license that was removed
	 * @throws PortalException if a cannabis conditional license with the primary key could not be found
	 */
	@Override
	public com.npm.cannabis.application.stages.services.model.
		CannabisConditionalLicense deleteCannabisConditionalLicense(
				long cannabisConditonalLicenseId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisConditionalLicenseLocalService.
			deleteCannabisConditionalLicense(cannabisConditonalLicenseId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisConditionalLicenseLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _cannabisConditionalLicenseLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _cannabisConditionalLicenseLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _cannabisConditionalLicenseLocalService.dynamicQuery();
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

		return _cannabisConditionalLicenseLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.npm.cannabis.application.stages.services.model.impl.CannabisConditionalLicenseModelImpl</code>.
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

		return _cannabisConditionalLicenseLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.npm.cannabis.application.stages.services.model.impl.CannabisConditionalLicenseModelImpl</code>.
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

		return _cannabisConditionalLicenseLocalService.dynamicQuery(
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

		return _cannabisConditionalLicenseLocalService.dynamicQueryCount(
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

		return _cannabisConditionalLicenseLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.npm.cannabis.application.stages.services.model.
		CannabisConditionalLicense fetchCannabisConditionalLicense(
			long cannabisConditonalLicenseId) {

		return _cannabisConditionalLicenseLocalService.
			fetchCannabisConditionalLicense(cannabisConditonalLicenseId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _cannabisConditionalLicenseLocalService.
			getActionableDynamicQuery();
	}

	/**
	 * Returns the cannabis conditional license with the primary key.
	 *
	 * @param cannabisConditonalLicenseId the primary key of the cannabis conditional license
	 * @return the cannabis conditional license
	 * @throws PortalException if a cannabis conditional license with the primary key could not be found
	 */
	@Override
	public com.npm.cannabis.application.stages.services.model.
		CannabisConditionalLicense getCannabisConditionalLicense(
				long cannabisConditonalLicenseId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisConditionalLicenseLocalService.
			getCannabisConditionalLicense(cannabisConditonalLicenseId);
	}

	@Override
	public com.npm.cannabis.application.stages.services.model.
		CannabisConditionalLicense getCannabisConditionalLicenseByCaseId(
				String caseId)
			throws com.npm.cannabis.application.stages.services.exception.
				NoSuchCannabisConditionalLicenseException {

		return _cannabisConditionalLicenseLocalService.
			getCannabisConditionalLicenseByCaseId(caseId);
	}

	/**
	 * Returns a range of all the cannabis conditional licenses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.npm.cannabis.application.stages.services.model.impl.CannabisConditionalLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis conditional licenses
	 * @param end the upper bound of the range of cannabis conditional licenses (not inclusive)
	 * @return the range of cannabis conditional licenses
	 */
	@Override
	public java.util.List
		<com.npm.cannabis.application.stages.services.model.
			CannabisConditionalLicense> getCannabisConditionalLicenses(
				int start, int end) {

		return _cannabisConditionalLicenseLocalService.
			getCannabisConditionalLicenses(start, end);
	}

	/**
	 * Returns the number of cannabis conditional licenses.
	 *
	 * @return the number of cannabis conditional licenses
	 */
	@Override
	public int getCannabisConditionalLicensesCount() {
		return _cannabisConditionalLicenseLocalService.
			getCannabisConditionalLicensesCount();
	}

	@Override
	public java.util.List
		<com.npm.cannabis.application.stages.services.model.
			CannabisConditionalLicense> getCCL_BycaseId(String caseId) {

		return _cannabisConditionalLicenseLocalService.getCCL_BycaseId(caseId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _cannabisConditionalLicenseLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _cannabisConditionalLicenseLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisConditionalLicenseLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the cannabis conditional license in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisConditionalLicenseLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisConditionalLicense the cannabis conditional license
	 * @return the cannabis conditional license that was updated
	 */
	@Override
	public com.npm.cannabis.application.stages.services.model.
		CannabisConditionalLicense updateCannabisConditionalLicense(
			com.npm.cannabis.application.stages.services.model.
				CannabisConditionalLicense cannabisConditionalLicense) {

		return _cannabisConditionalLicenseLocalService.
			updateCannabisConditionalLicense(cannabisConditionalLicense);
	}

	@Override
	public com.npm.cannabis.application.stages.services.model.
		CannabisConditionalLicense updateCannabisConditionalLicense(
			String caseId, String numberOfextension, java.util.Date issueDate,
			java.util.Date expirationDate, String listOfPreConditions,
			long licenseFileId) {

		return _cannabisConditionalLicenseLocalService.
			updateCannabisConditionalLicense(
				caseId, numberOfextension, issueDate, expirationDate,
				listOfPreConditions, licenseFileId);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _cannabisConditionalLicenseLocalService.getBasePersistence();
	}

	@Override
	public CannabisConditionalLicenseLocalService getWrappedService() {
		return _cannabisConditionalLicenseLocalService;
	}

	@Override
	public void setWrappedService(
		CannabisConditionalLicenseLocalService
			cannabisConditionalLicenseLocalService) {

		_cannabisConditionalLicenseLocalService =
			cannabisConditionalLicenseLocalService;
	}

	private CannabisConditionalLicenseLocalService
		_cannabisConditionalLicenseLocalService;

}