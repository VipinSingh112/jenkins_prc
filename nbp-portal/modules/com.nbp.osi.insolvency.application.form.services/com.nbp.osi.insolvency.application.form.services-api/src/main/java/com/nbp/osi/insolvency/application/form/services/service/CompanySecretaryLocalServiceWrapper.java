/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link CompanySecretaryLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CompanySecretaryLocalService
 * @generated
 */
public class CompanySecretaryLocalServiceWrapper
	implements CompanySecretaryLocalService,
			   ServiceWrapper<CompanySecretaryLocalService> {

	public CompanySecretaryLocalServiceWrapper() {
		this(null);
	}

	public CompanySecretaryLocalServiceWrapper(
		CompanySecretaryLocalService companySecretaryLocalService) {

		_companySecretaryLocalService = companySecretaryLocalService;
	}

	/**
	 * Adds the company secretary to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CompanySecretaryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param companySecretary the company secretary
	 * @return the company secretary that was added
	 */
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.CompanySecretary
			addCompanySecretary(
				com.nbp.osi.insolvency.application.form.services.model.
					CompanySecretary companySecretary) {

		return _companySecretaryLocalService.addCompanySecretary(
			companySecretary);
	}

	/**
	 * Creates a new company secretary with the primary key. Does not add the company secretary to the database.
	 *
	 * @param companySecretaryId the primary key for the new company secretary
	 * @return the new company secretary
	 */
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.CompanySecretary
			createCompanySecretary(long companySecretaryId) {

		return _companySecretaryLocalService.createCompanySecretary(
			companySecretaryId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _companySecretaryLocalService.createPersistedModel(
			primaryKeyObj);
	}

	@Override
	public void deleteBY_Id(long applicationId) {
		_companySecretaryLocalService.deleteBY_Id(applicationId);
	}

	/**
	 * Deletes the company secretary from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CompanySecretaryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param companySecretary the company secretary
	 * @return the company secretary that was removed
	 */
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.CompanySecretary
			deleteCompanySecretary(
				com.nbp.osi.insolvency.application.form.services.model.
					CompanySecretary companySecretary) {

		return _companySecretaryLocalService.deleteCompanySecretary(
			companySecretary);
	}

	/**
	 * Deletes the company secretary with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CompanySecretaryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param companySecretaryId the primary key of the company secretary
	 * @return the company secretary that was removed
	 * @throws PortalException if a company secretary with the primary key could not be found
	 */
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.CompanySecretary
				deleteCompanySecretary(long companySecretaryId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _companySecretaryLocalService.deleteCompanySecretary(
			companySecretaryId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _companySecretaryLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _companySecretaryLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _companySecretaryLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _companySecretaryLocalService.dynamicQuery();
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

		return _companySecretaryLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.CompanySecretaryModelImpl</code>.
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

		return _companySecretaryLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.CompanySecretaryModelImpl</code>.
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

		return _companySecretaryLocalService.dynamicQuery(
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

		return _companySecretaryLocalService.dynamicQueryCount(dynamicQuery);
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

		return _companySecretaryLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.CompanySecretary
			fetchCompanySecretary(long companySecretaryId) {

		return _companySecretaryLocalService.fetchCompanySecretary(
			companySecretaryId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _companySecretaryLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns a range of all the company secretaries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.CompanySecretaryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of company secretaries
	 * @param end the upper bound of the range of company secretaries (not inclusive)
	 * @return the range of company secretaries
	 */
	@Override
	public java.util.List
		<com.nbp.osi.insolvency.application.form.services.model.
			CompanySecretary> getCompanySecretaries(int start, int end) {

		return _companySecretaryLocalService.getCompanySecretaries(start, end);
	}

	/**
	 * Returns the number of company secretaries.
	 *
	 * @return the number of company secretaries
	 */
	@Override
	public int getCompanySecretariesCount() {
		return _companySecretaryLocalService.getCompanySecretariesCount();
	}

	/**
	 * Returns the company secretary with the primary key.
	 *
	 * @param companySecretaryId the primary key of the company secretary
	 * @return the company secretary
	 * @throws PortalException if a company secretary with the primary key could not be found
	 */
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.CompanySecretary
				getCompanySecretary(long companySecretaryId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _companySecretaryLocalService.getCompanySecretary(
			companySecretaryId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _companySecretaryLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _companySecretaryLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List
		<com.nbp.osi.insolvency.application.form.services.model.
			CompanySecretary> getOsiById(long osiInsolvencyId)
				throws com.nbp.osi.insolvency.application.form.services.
					exception.NoSuchCompanySecretaryException {

		return _companySecretaryLocalService.getOsiById(osiInsolvencyId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _companySecretaryLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the company secretary in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CompanySecretaryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param companySecretary the company secretary
	 * @return the company secretary that was updated
	 */
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.CompanySecretary
			updateCompanySecretary(
				com.nbp.osi.insolvency.application.form.services.model.
					CompanySecretary companySecretary) {

		return _companySecretaryLocalService.updateCompanySecretary(
			companySecretary);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _companySecretaryLocalService.getBasePersistence();
	}

	@Override
	public CompanySecretaryLocalService getWrappedService() {
		return _companySecretaryLocalService;
	}

	@Override
	public void setWrappedService(
		CompanySecretaryLocalService companySecretaryLocalService) {

		_companySecretaryLocalService = companySecretaryLocalService;
	}

	private CompanySecretaryLocalService _companySecretaryLocalService;

}