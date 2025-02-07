/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link CompanyUnsecuredCreditorLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CompanyUnsecuredCreditorLocalService
 * @generated
 */
public class CompanyUnsecuredCreditorLocalServiceWrapper
	implements CompanyUnsecuredCreditorLocalService,
			   ServiceWrapper<CompanyUnsecuredCreditorLocalService> {

	public CompanyUnsecuredCreditorLocalServiceWrapper() {
		this(null);
	}

	public CompanyUnsecuredCreditorLocalServiceWrapper(
		CompanyUnsecuredCreditorLocalService
			companyUnsecuredCreditorLocalService) {

		_companyUnsecuredCreditorLocalService =
			companyUnsecuredCreditorLocalService;
	}

	/**
	 * Adds the company unsecured creditor to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CompanyUnsecuredCreditorLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param companyUnsecuredCreditor the company unsecured creditor
	 * @return the company unsecured creditor that was added
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		CompanyUnsecuredCreditor addCompanyUnsecuredCreditor(
			com.nbp.osi.insolvency.application.form.services.model.
				CompanyUnsecuredCreditor companyUnsecuredCreditor) {

		return _companyUnsecuredCreditorLocalService.
			addCompanyUnsecuredCreditor(companyUnsecuredCreditor);
	}

	/**
	 * Creates a new company unsecured creditor with the primary key. Does not add the company unsecured creditor to the database.
	 *
	 * @param companyUnsecuredCreditorId the primary key for the new company unsecured creditor
	 * @return the new company unsecured creditor
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		CompanyUnsecuredCreditor createCompanyUnsecuredCreditor(
			long companyUnsecuredCreditorId) {

		return _companyUnsecuredCreditorLocalService.
			createCompanyUnsecuredCreditor(companyUnsecuredCreditorId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _companyUnsecuredCreditorLocalService.createPersistedModel(
			primaryKeyObj);
	}

	@Override
	public void deleteBY_Id(long applicationId) {
		_companyUnsecuredCreditorLocalService.deleteBY_Id(applicationId);
	}

	/**
	 * Deletes the company unsecured creditor from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CompanyUnsecuredCreditorLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param companyUnsecuredCreditor the company unsecured creditor
	 * @return the company unsecured creditor that was removed
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		CompanyUnsecuredCreditor deleteCompanyUnsecuredCreditor(
			com.nbp.osi.insolvency.application.form.services.model.
				CompanyUnsecuredCreditor companyUnsecuredCreditor) {

		return _companyUnsecuredCreditorLocalService.
			deleteCompanyUnsecuredCreditor(companyUnsecuredCreditor);
	}

	/**
	 * Deletes the company unsecured creditor with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CompanyUnsecuredCreditorLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param companyUnsecuredCreditorId the primary key of the company unsecured creditor
	 * @return the company unsecured creditor that was removed
	 * @throws PortalException if a company unsecured creditor with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		CompanyUnsecuredCreditor deleteCompanyUnsecuredCreditor(
				long companyUnsecuredCreditorId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _companyUnsecuredCreditorLocalService.
			deleteCompanyUnsecuredCreditor(companyUnsecuredCreditorId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _companyUnsecuredCreditorLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _companyUnsecuredCreditorLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _companyUnsecuredCreditorLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _companyUnsecuredCreditorLocalService.dynamicQuery();
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

		return _companyUnsecuredCreditorLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.CompanyUnsecuredCreditorModelImpl</code>.
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

		return _companyUnsecuredCreditorLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.CompanyUnsecuredCreditorModelImpl</code>.
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

		return _companyUnsecuredCreditorLocalService.dynamicQuery(
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

		return _companyUnsecuredCreditorLocalService.dynamicQueryCount(
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

		return _companyUnsecuredCreditorLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		CompanyUnsecuredCreditor fetchCompanyUnsecuredCreditor(
			long companyUnsecuredCreditorId) {

		return _companyUnsecuredCreditorLocalService.
			fetchCompanyUnsecuredCreditor(companyUnsecuredCreditorId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _companyUnsecuredCreditorLocalService.
			getActionableDynamicQuery();
	}

	/**
	 * Returns the company unsecured creditor with the primary key.
	 *
	 * @param companyUnsecuredCreditorId the primary key of the company unsecured creditor
	 * @return the company unsecured creditor
	 * @throws PortalException if a company unsecured creditor with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		CompanyUnsecuredCreditor getCompanyUnsecuredCreditor(
				long companyUnsecuredCreditorId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _companyUnsecuredCreditorLocalService.
			getCompanyUnsecuredCreditor(companyUnsecuredCreditorId);
	}

	/**
	 * Returns a range of all the company unsecured creditors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.CompanyUnsecuredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of company unsecured creditors
	 * @param end the upper bound of the range of company unsecured creditors (not inclusive)
	 * @return the range of company unsecured creditors
	 */
	@Override
	public java.util.List
		<com.nbp.osi.insolvency.application.form.services.model.
			CompanyUnsecuredCreditor> getCompanyUnsecuredCreditors(
				int start, int end) {

		return _companyUnsecuredCreditorLocalService.
			getCompanyUnsecuredCreditors(start, end);
	}

	/**
	 * Returns the number of company unsecured creditors.
	 *
	 * @return the number of company unsecured creditors
	 */
	@Override
	public int getCompanyUnsecuredCreditorsCount() {
		return _companyUnsecuredCreditorLocalService.
			getCompanyUnsecuredCreditorsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _companyUnsecuredCreditorLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _companyUnsecuredCreditorLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List
		<com.nbp.osi.insolvency.application.form.services.model.
			CompanyUnsecuredCreditor> getOsiById(long osiInsolvencyId)
				throws com.nbp.osi.insolvency.application.form.services.
					exception.NoSuchCompanyUnsecuredCreditorException {

		return _companyUnsecuredCreditorLocalService.getOsiById(
			osiInsolvencyId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _companyUnsecuredCreditorLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the company unsecured creditor in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CompanyUnsecuredCreditorLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param companyUnsecuredCreditor the company unsecured creditor
	 * @return the company unsecured creditor that was updated
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		CompanyUnsecuredCreditor updateCompanyUnsecuredCreditor(
			com.nbp.osi.insolvency.application.form.services.model.
				CompanyUnsecuredCreditor companyUnsecuredCreditor) {

		return _companyUnsecuredCreditorLocalService.
			updateCompanyUnsecuredCreditor(companyUnsecuredCreditor);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _companyUnsecuredCreditorLocalService.getBasePersistence();
	}

	@Override
	public CompanyUnsecuredCreditorLocalService getWrappedService() {
		return _companyUnsecuredCreditorLocalService;
	}

	@Override
	public void setWrappedService(
		CompanyUnsecuredCreditorLocalService
			companyUnsecuredCreditorLocalService) {

		_companyUnsecuredCreditorLocalService =
			companyUnsecuredCreditorLocalService;
	}

	private CompanyUnsecuredCreditorLocalService
		_companyUnsecuredCreditorLocalService;

}