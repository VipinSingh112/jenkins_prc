/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link CompanySecuredCreditorLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CompanySecuredCreditorLocalService
 * @generated
 */
public class CompanySecuredCreditorLocalServiceWrapper
	implements CompanySecuredCreditorLocalService,
			   ServiceWrapper<CompanySecuredCreditorLocalService> {

	public CompanySecuredCreditorLocalServiceWrapper() {
		this(null);
	}

	public CompanySecuredCreditorLocalServiceWrapper(
		CompanySecuredCreditorLocalService companySecuredCreditorLocalService) {

		_companySecuredCreditorLocalService =
			companySecuredCreditorLocalService;
	}

	/**
	 * Adds the company secured creditor to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CompanySecuredCreditorLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param companySecuredCreditor the company secured creditor
	 * @return the company secured creditor that was added
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		CompanySecuredCreditor addCompanySecuredCreditor(
			com.nbp.osi.insolvency.application.form.services.model.
				CompanySecuredCreditor companySecuredCreditor) {

		return _companySecuredCreditorLocalService.addCompanySecuredCreditor(
			companySecuredCreditor);
	}

	/**
	 * Creates a new company secured creditor with the primary key. Does not add the company secured creditor to the database.
	 *
	 * @param companySecuredCreditorId the primary key for the new company secured creditor
	 * @return the new company secured creditor
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		CompanySecuredCreditor createCompanySecuredCreditor(
			long companySecuredCreditorId) {

		return _companySecuredCreditorLocalService.createCompanySecuredCreditor(
			companySecuredCreditorId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _companySecuredCreditorLocalService.createPersistedModel(
			primaryKeyObj);
	}

	@Override
	public void deleteBY_Id(long applicationId) {
		_companySecuredCreditorLocalService.deleteBY_Id(applicationId);
	}

	/**
	 * Deletes the company secured creditor from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CompanySecuredCreditorLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param companySecuredCreditor the company secured creditor
	 * @return the company secured creditor that was removed
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		CompanySecuredCreditor deleteCompanySecuredCreditor(
			com.nbp.osi.insolvency.application.form.services.model.
				CompanySecuredCreditor companySecuredCreditor) {

		return _companySecuredCreditorLocalService.deleteCompanySecuredCreditor(
			companySecuredCreditor);
	}

	/**
	 * Deletes the company secured creditor with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CompanySecuredCreditorLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param companySecuredCreditorId the primary key of the company secured creditor
	 * @return the company secured creditor that was removed
	 * @throws PortalException if a company secured creditor with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		CompanySecuredCreditor deleteCompanySecuredCreditor(
				long companySecuredCreditorId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _companySecuredCreditorLocalService.deleteCompanySecuredCreditor(
			companySecuredCreditorId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _companySecuredCreditorLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _companySecuredCreditorLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _companySecuredCreditorLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _companySecuredCreditorLocalService.dynamicQuery();
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

		return _companySecuredCreditorLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.CompanySecuredCreditorModelImpl</code>.
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

		return _companySecuredCreditorLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.CompanySecuredCreditorModelImpl</code>.
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

		return _companySecuredCreditorLocalService.dynamicQuery(
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

		return _companySecuredCreditorLocalService.dynamicQueryCount(
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

		return _companySecuredCreditorLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		CompanySecuredCreditor fetchCompanySecuredCreditor(
			long companySecuredCreditorId) {

		return _companySecuredCreditorLocalService.fetchCompanySecuredCreditor(
			companySecuredCreditorId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _companySecuredCreditorLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the company secured creditor with the primary key.
	 *
	 * @param companySecuredCreditorId the primary key of the company secured creditor
	 * @return the company secured creditor
	 * @throws PortalException if a company secured creditor with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		CompanySecuredCreditor getCompanySecuredCreditor(
				long companySecuredCreditorId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _companySecuredCreditorLocalService.getCompanySecuredCreditor(
			companySecuredCreditorId);
	}

	/**
	 * Returns a range of all the company secured creditors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.CompanySecuredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of company secured creditors
	 * @param end the upper bound of the range of company secured creditors (not inclusive)
	 * @return the range of company secured creditors
	 */
	@Override
	public java.util.List
		<com.nbp.osi.insolvency.application.form.services.model.
			CompanySecuredCreditor> getCompanySecuredCreditors(
				int start, int end) {

		return _companySecuredCreditorLocalService.getCompanySecuredCreditors(
			start, end);
	}

	/**
	 * Returns the number of company secured creditors.
	 *
	 * @return the number of company secured creditors
	 */
	@Override
	public int getCompanySecuredCreditorsCount() {
		return _companySecuredCreditorLocalService.
			getCompanySecuredCreditorsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _companySecuredCreditorLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _companySecuredCreditorLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List
		<com.nbp.osi.insolvency.application.form.services.model.
			CompanySecuredCreditor> getOsiById(long osiInsolvencyId)
				throws com.nbp.osi.insolvency.application.form.services.
					exception.NoSuchCompanySecuredCreditorException {

		return _companySecuredCreditorLocalService.getOsiById(osiInsolvencyId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _companySecuredCreditorLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the company secured creditor in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CompanySecuredCreditorLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param companySecuredCreditor the company secured creditor
	 * @return the company secured creditor that was updated
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		CompanySecuredCreditor updateCompanySecuredCreditor(
			com.nbp.osi.insolvency.application.form.services.model.
				CompanySecuredCreditor companySecuredCreditor) {

		return _companySecuredCreditorLocalService.updateCompanySecuredCreditor(
			companySecuredCreditor);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _companySecuredCreditorLocalService.getBasePersistence();
	}

	@Override
	public CompanySecuredCreditorLocalService getWrappedService() {
		return _companySecuredCreditorLocalService;
	}

	@Override
	public void setWrappedService(
		CompanySecuredCreditorLocalService companySecuredCreditorLocalService) {

		_companySecuredCreditorLocalService =
			companySecuredCreditorLocalService;
	}

	private CompanySecuredCreditorLocalService
		_companySecuredCreditorLocalService;

}