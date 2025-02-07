/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link CompanyFinancialPositionLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CompanyFinancialPositionLocalService
 * @generated
 */
public class CompanyFinancialPositionLocalServiceWrapper
	implements CompanyFinancialPositionLocalService,
			   ServiceWrapper<CompanyFinancialPositionLocalService> {

	public CompanyFinancialPositionLocalServiceWrapper() {
		this(null);
	}

	public CompanyFinancialPositionLocalServiceWrapper(
		CompanyFinancialPositionLocalService
			companyFinancialPositionLocalService) {

		_companyFinancialPositionLocalService =
			companyFinancialPositionLocalService;
	}

	/**
	 * Adds the company financial position to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CompanyFinancialPositionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param companyFinancialPosition the company financial position
	 * @return the company financial position that was added
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		CompanyFinancialPosition addCompanyFinancialPosition(
			com.nbp.osi.insolvency.application.form.services.model.
				CompanyFinancialPosition companyFinancialPosition) {

		return _companyFinancialPositionLocalService.
			addCompanyFinancialPosition(companyFinancialPosition);
	}

	/**
	 * Creates a new company financial position with the primary key. Does not add the company financial position to the database.
	 *
	 * @param companyFinancialPositionId the primary key for the new company financial position
	 * @return the new company financial position
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		CompanyFinancialPosition createCompanyFinancialPosition(
			long companyFinancialPositionId) {

		return _companyFinancialPositionLocalService.
			createCompanyFinancialPosition(companyFinancialPositionId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _companyFinancialPositionLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the company financial position from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CompanyFinancialPositionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param companyFinancialPosition the company financial position
	 * @return the company financial position that was removed
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		CompanyFinancialPosition deleteCompanyFinancialPosition(
			com.nbp.osi.insolvency.application.form.services.model.
				CompanyFinancialPosition companyFinancialPosition) {

		return _companyFinancialPositionLocalService.
			deleteCompanyFinancialPosition(companyFinancialPosition);
	}

	/**
	 * Deletes the company financial position with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CompanyFinancialPositionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param companyFinancialPositionId the primary key of the company financial position
	 * @return the company financial position that was removed
	 * @throws PortalException if a company financial position with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		CompanyFinancialPosition deleteCompanyFinancialPosition(
				long companyFinancialPositionId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _companyFinancialPositionLocalService.
			deleteCompanyFinancialPosition(companyFinancialPositionId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _companyFinancialPositionLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _companyFinancialPositionLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _companyFinancialPositionLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _companyFinancialPositionLocalService.dynamicQuery();
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

		return _companyFinancialPositionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.CompanyFinancialPositionModelImpl</code>.
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

		return _companyFinancialPositionLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.CompanyFinancialPositionModelImpl</code>.
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

		return _companyFinancialPositionLocalService.dynamicQuery(
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

		return _companyFinancialPositionLocalService.dynamicQueryCount(
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

		return _companyFinancialPositionLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		CompanyFinancialPosition fetchCompanyFinancialPosition(
			long companyFinancialPositionId) {

		return _companyFinancialPositionLocalService.
			fetchCompanyFinancialPosition(companyFinancialPositionId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _companyFinancialPositionLocalService.
			getActionableDynamicQuery();
	}

	/**
	 * Returns the company financial position with the primary key.
	 *
	 * @param companyFinancialPositionId the primary key of the company financial position
	 * @return the company financial position
	 * @throws PortalException if a company financial position with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		CompanyFinancialPosition getCompanyFinancialPosition(
				long companyFinancialPositionId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _companyFinancialPositionLocalService.
			getCompanyFinancialPosition(companyFinancialPositionId);
	}

	/**
	 * Returns a range of all the company financial positions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.CompanyFinancialPositionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of company financial positions
	 * @param end the upper bound of the range of company financial positions (not inclusive)
	 * @return the range of company financial positions
	 */
	@Override
	public java.util.List
		<com.nbp.osi.insolvency.application.form.services.model.
			CompanyFinancialPosition> getCompanyFinancialPositions(
				int start, int end) {

		return _companyFinancialPositionLocalService.
			getCompanyFinancialPositions(start, end);
	}

	/**
	 * Returns the number of company financial positions.
	 *
	 * @return the number of company financial positions
	 */
	@Override
	public int getCompanyFinancialPositionsCount() {
		return _companyFinancialPositionLocalService.
			getCompanyFinancialPositionsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _companyFinancialPositionLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _companyFinancialPositionLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		CompanyFinancialPosition getOsiById(long osiInsolvencyId)
			throws com.nbp.osi.insolvency.application.form.services.exception.
				NoSuchCompanyFinancialPositionException {

		return _companyFinancialPositionLocalService.getOsiById(
			osiInsolvencyId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _companyFinancialPositionLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the company financial position in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CompanyFinancialPositionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param companyFinancialPosition the company financial position
	 * @return the company financial position that was updated
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		CompanyFinancialPosition updateCompanyFinancialPosition(
			com.nbp.osi.insolvency.application.form.services.model.
				CompanyFinancialPosition companyFinancialPosition) {

		return _companyFinancialPositionLocalService.
			updateCompanyFinancialPosition(companyFinancialPosition);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _companyFinancialPositionLocalService.getBasePersistence();
	}

	@Override
	public CompanyFinancialPositionLocalService getWrappedService() {
		return _companyFinancialPositionLocalService;
	}

	@Override
	public void setWrappedService(
		CompanyFinancialPositionLocalService
			companyFinancialPositionLocalService) {

		_companyFinancialPositionLocalService =
			companyFinancialPositionLocalService;
	}

	private CompanyFinancialPositionLocalService
		_companyFinancialPositionLocalService;

}