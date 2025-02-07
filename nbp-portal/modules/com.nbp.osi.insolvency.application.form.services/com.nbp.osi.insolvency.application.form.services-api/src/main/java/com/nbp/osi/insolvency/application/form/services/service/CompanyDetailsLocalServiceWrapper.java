/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link CompanyDetailsLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CompanyDetailsLocalService
 * @generated
 */
public class CompanyDetailsLocalServiceWrapper
	implements CompanyDetailsLocalService,
			   ServiceWrapper<CompanyDetailsLocalService> {

	public CompanyDetailsLocalServiceWrapper() {
		this(null);
	}

	public CompanyDetailsLocalServiceWrapper(
		CompanyDetailsLocalService companyDetailsLocalService) {

		_companyDetailsLocalService = companyDetailsLocalService;
	}

	/**
	 * Adds the company details to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CompanyDetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param companyDetails the company details
	 * @return the company details that was added
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.CompanyDetails
		addCompanyDetails(
			com.nbp.osi.insolvency.application.form.services.model.
				CompanyDetails companyDetails) {

		return _companyDetailsLocalService.addCompanyDetails(companyDetails);
	}

	/**
	 * Creates a new company details with the primary key. Does not add the company details to the database.
	 *
	 * @param companyDetailsId the primary key for the new company details
	 * @return the new company details
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.CompanyDetails
		createCompanyDetails(long companyDetailsId) {

		return _companyDetailsLocalService.createCompanyDetails(
			companyDetailsId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _companyDetailsLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the company details from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CompanyDetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param companyDetails the company details
	 * @return the company details that was removed
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.CompanyDetails
		deleteCompanyDetails(
			com.nbp.osi.insolvency.application.form.services.model.
				CompanyDetails companyDetails) {

		return _companyDetailsLocalService.deleteCompanyDetails(companyDetails);
	}

	/**
	 * Deletes the company details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CompanyDetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param companyDetailsId the primary key of the company details
	 * @return the company details that was removed
	 * @throws PortalException if a company details with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.CompanyDetails
			deleteCompanyDetails(long companyDetailsId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _companyDetailsLocalService.deleteCompanyDetails(
			companyDetailsId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _companyDetailsLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _companyDetailsLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _companyDetailsLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _companyDetailsLocalService.dynamicQuery();
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

		return _companyDetailsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.CompanyDetailsModelImpl</code>.
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

		return _companyDetailsLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.CompanyDetailsModelImpl</code>.
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

		return _companyDetailsLocalService.dynamicQuery(
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

		return _companyDetailsLocalService.dynamicQueryCount(dynamicQuery);
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

		return _companyDetailsLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.osi.insolvency.application.form.services.model.CompanyDetails
		fetchCompanyDetails(long companyDetailsId) {

		return _companyDetailsLocalService.fetchCompanyDetails(
			companyDetailsId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _companyDetailsLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the company details with the primary key.
	 *
	 * @param companyDetailsId the primary key of the company details
	 * @return the company details
	 * @throws PortalException if a company details with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.CompanyDetails
			getCompanyDetails(long companyDetailsId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _companyDetailsLocalService.getCompanyDetails(companyDetailsId);
	}

	/**
	 * Returns a range of all the company detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.CompanyDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of company detailses
	 * @param end the upper bound of the range of company detailses (not inclusive)
	 * @return the range of company detailses
	 */
	@Override
	public java.util.List
		<com.nbp.osi.insolvency.application.form.services.model.CompanyDetails>
			getCompanyDetailses(int start, int end) {

		return _companyDetailsLocalService.getCompanyDetailses(start, end);
	}

	/**
	 * Returns the number of company detailses.
	 *
	 * @return the number of company detailses
	 */
	@Override
	public int getCompanyDetailsesCount() {
		return _companyDetailsLocalService.getCompanyDetailsesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _companyDetailsLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _companyDetailsLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.nbp.osi.insolvency.application.form.services.model.CompanyDetails
			getOsiInsolvencyById(long osiInsolvencyId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchCompanyDetailsException {

		return _companyDetailsLocalService.getOsiInsolvencyById(
			osiInsolvencyId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _companyDetailsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the company details in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CompanyDetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param companyDetails the company details
	 * @return the company details that was updated
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.CompanyDetails
		updateCompanyDetails(
			com.nbp.osi.insolvency.application.form.services.model.
				CompanyDetails companyDetails) {

		return _companyDetailsLocalService.updateCompanyDetails(companyDetails);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _companyDetailsLocalService.getBasePersistence();
	}

	@Override
	public CompanyDetailsLocalService getWrappedService() {
		return _companyDetailsLocalService;
	}

	@Override
	public void setWrappedService(
		CompanyDetailsLocalService companyDetailsLocalService) {

		_companyDetailsLocalService = companyDetailsLocalService;
	}

	private CompanyDetailsLocalService _companyDetailsLocalService;

}