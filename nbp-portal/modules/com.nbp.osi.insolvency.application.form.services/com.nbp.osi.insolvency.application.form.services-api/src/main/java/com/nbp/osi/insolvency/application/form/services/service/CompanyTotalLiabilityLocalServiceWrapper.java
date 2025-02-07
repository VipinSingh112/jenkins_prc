/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link CompanyTotalLiabilityLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CompanyTotalLiabilityLocalService
 * @generated
 */
public class CompanyTotalLiabilityLocalServiceWrapper
	implements CompanyTotalLiabilityLocalService,
			   ServiceWrapper<CompanyTotalLiabilityLocalService> {

	public CompanyTotalLiabilityLocalServiceWrapper() {
		this(null);
	}

	public CompanyTotalLiabilityLocalServiceWrapper(
		CompanyTotalLiabilityLocalService companyTotalLiabilityLocalService) {

		_companyTotalLiabilityLocalService = companyTotalLiabilityLocalService;
	}

	/**
	 * Adds the company total liability to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CompanyTotalLiabilityLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param companyTotalLiability the company total liability
	 * @return the company total liability that was added
	 */
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.
			CompanyTotalLiability addCompanyTotalLiability(
				com.nbp.osi.insolvency.application.form.services.model.
					CompanyTotalLiability companyTotalLiability) {

		return _companyTotalLiabilityLocalService.addCompanyTotalLiability(
			companyTotalLiability);
	}

	/**
	 * Creates a new company total liability with the primary key. Does not add the company total liability to the database.
	 *
	 * @param companyTotalLiabilityId the primary key for the new company total liability
	 * @return the new company total liability
	 */
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.
			CompanyTotalLiability createCompanyTotalLiability(
				long companyTotalLiabilityId) {

		return _companyTotalLiabilityLocalService.createCompanyTotalLiability(
			companyTotalLiabilityId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _companyTotalLiabilityLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the company total liability from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CompanyTotalLiabilityLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param companyTotalLiability the company total liability
	 * @return the company total liability that was removed
	 */
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.
			CompanyTotalLiability deleteCompanyTotalLiability(
				com.nbp.osi.insolvency.application.form.services.model.
					CompanyTotalLiability companyTotalLiability) {

		return _companyTotalLiabilityLocalService.deleteCompanyTotalLiability(
			companyTotalLiability);
	}

	/**
	 * Deletes the company total liability with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CompanyTotalLiabilityLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param companyTotalLiabilityId the primary key of the company total liability
	 * @return the company total liability that was removed
	 * @throws PortalException if a company total liability with the primary key could not be found
	 */
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.
			CompanyTotalLiability deleteCompanyTotalLiability(
					long companyTotalLiabilityId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _companyTotalLiabilityLocalService.deleteCompanyTotalLiability(
			companyTotalLiabilityId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _companyTotalLiabilityLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _companyTotalLiabilityLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _companyTotalLiabilityLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _companyTotalLiabilityLocalService.dynamicQuery();
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

		return _companyTotalLiabilityLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.CompanyTotalLiabilityModelImpl</code>.
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

		return _companyTotalLiabilityLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.CompanyTotalLiabilityModelImpl</code>.
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

		return _companyTotalLiabilityLocalService.dynamicQuery(
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

		return _companyTotalLiabilityLocalService.dynamicQueryCount(
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

		return _companyTotalLiabilityLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.
			CompanyTotalLiability fetchCompanyTotalLiability(
				long companyTotalLiabilityId) {

		return _companyTotalLiabilityLocalService.fetchCompanyTotalLiability(
			companyTotalLiabilityId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _companyTotalLiabilityLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns a range of all the company total liabilities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.CompanyTotalLiabilityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of company total liabilities
	 * @param end the upper bound of the range of company total liabilities (not inclusive)
	 * @return the range of company total liabilities
	 */
	@Override
	public java.util.List
		<com.nbp.osi.insolvency.application.form.services.model.
			CompanyTotalLiability> getCompanyTotalLiabilities(
				int start, int end) {

		return _companyTotalLiabilityLocalService.getCompanyTotalLiabilities(
			start, end);
	}

	/**
	 * Returns the number of company total liabilities.
	 *
	 * @return the number of company total liabilities
	 */
	@Override
	public int getCompanyTotalLiabilitiesCount() {
		return _companyTotalLiabilityLocalService.
			getCompanyTotalLiabilitiesCount();
	}

	/**
	 * Returns the company total liability with the primary key.
	 *
	 * @param companyTotalLiabilityId the primary key of the company total liability
	 * @return the company total liability
	 * @throws PortalException if a company total liability with the primary key could not be found
	 */
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.
			CompanyTotalLiability getCompanyTotalLiability(
					long companyTotalLiabilityId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _companyTotalLiabilityLocalService.getCompanyTotalLiability(
			companyTotalLiabilityId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _companyTotalLiabilityLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _companyTotalLiabilityLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _companyTotalLiabilityLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the company total liability in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CompanyTotalLiabilityLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param companyTotalLiability the company total liability
	 * @return the company total liability that was updated
	 */
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.
			CompanyTotalLiability updateCompanyTotalLiability(
				com.nbp.osi.insolvency.application.form.services.model.
					CompanyTotalLiability companyTotalLiability) {

		return _companyTotalLiabilityLocalService.updateCompanyTotalLiability(
			companyTotalLiability);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _companyTotalLiabilityLocalService.getBasePersistence();
	}

	@Override
	public CompanyTotalLiabilityLocalService getWrappedService() {
		return _companyTotalLiabilityLocalService;
	}

	@Override
	public void setWrappedService(
		CompanyTotalLiabilityLocalService companyTotalLiabilityLocalService) {

		_companyTotalLiabilityLocalService = companyTotalLiabilityLocalService;
	}

	private CompanyTotalLiabilityLocalService
		_companyTotalLiabilityLocalService;

}