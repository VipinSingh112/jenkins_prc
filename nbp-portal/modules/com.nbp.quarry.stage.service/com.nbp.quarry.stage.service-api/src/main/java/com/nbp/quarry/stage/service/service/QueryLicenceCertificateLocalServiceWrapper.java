/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quarry.stage.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link QueryLicenceCertificateLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see QueryLicenceCertificateLocalService
 * @generated
 */
public class QueryLicenceCertificateLocalServiceWrapper
	implements QueryLicenceCertificateLocalService,
			   ServiceWrapper<QueryLicenceCertificateLocalService> {

	public QueryLicenceCertificateLocalServiceWrapper() {
		this(null);
	}

	public QueryLicenceCertificateLocalServiceWrapper(
		QueryLicenceCertificateLocalService
			queryLicenceCertificateLocalService) {

		_queryLicenceCertificateLocalService =
			queryLicenceCertificateLocalService;
	}

	/**
	 * Adds the query licence certificate to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QueryLicenceCertificateLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param queryLicenceCertificate the query licence certificate
	 * @return the query licence certificate that was added
	 */
	@Override
	public com.nbp.quarry.stage.service.model.QueryLicenceCertificate
		addQueryLicenceCertificate(
			com.nbp.quarry.stage.service.model.QueryLicenceCertificate
				queryLicenceCertificate) {

		return _queryLicenceCertificateLocalService.addQueryLicenceCertificate(
			queryLicenceCertificate);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _queryLicenceCertificateLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new query licence certificate with the primary key. Does not add the query licence certificate to the database.
	 *
	 * @param queryLicenceCertificateId the primary key for the new query licence certificate
	 * @return the new query licence certificate
	 */
	@Override
	public com.nbp.quarry.stage.service.model.QueryLicenceCertificate
		createQueryLicenceCertificate(long queryLicenceCertificateId) {

		return _queryLicenceCertificateLocalService.
			createQueryLicenceCertificate(queryLicenceCertificateId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _queryLicenceCertificateLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the query licence certificate with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QueryLicenceCertificateLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param queryLicenceCertificateId the primary key of the query licence certificate
	 * @return the query licence certificate that was removed
	 * @throws PortalException if a query licence certificate with the primary key could not be found
	 */
	@Override
	public com.nbp.quarry.stage.service.model.QueryLicenceCertificate
			deleteQueryLicenceCertificate(long queryLicenceCertificateId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _queryLicenceCertificateLocalService.
			deleteQueryLicenceCertificate(queryLicenceCertificateId);
	}

	/**
	 * Deletes the query licence certificate from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QueryLicenceCertificateLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param queryLicenceCertificate the query licence certificate
	 * @return the query licence certificate that was removed
	 */
	@Override
	public com.nbp.quarry.stage.service.model.QueryLicenceCertificate
		deleteQueryLicenceCertificate(
			com.nbp.quarry.stage.service.model.QueryLicenceCertificate
				queryLicenceCertificate) {

		return _queryLicenceCertificateLocalService.
			deleteQueryLicenceCertificate(queryLicenceCertificate);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _queryLicenceCertificateLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _queryLicenceCertificateLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _queryLicenceCertificateLocalService.dynamicQuery();
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

		return _queryLicenceCertificateLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quarry.stage.service.model.impl.QueryLicenceCertificateModelImpl</code>.
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

		return _queryLicenceCertificateLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quarry.stage.service.model.impl.QueryLicenceCertificateModelImpl</code>.
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

		return _queryLicenceCertificateLocalService.dynamicQuery(
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

		return _queryLicenceCertificateLocalService.dynamicQueryCount(
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

		return _queryLicenceCertificateLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.quarry.stage.service.model.QueryLicenceCertificate
		fetchQueryLicenceCertificate(long queryLicenceCertificateId) {

		return _queryLicenceCertificateLocalService.
			fetchQueryLicenceCertificate(queryLicenceCertificateId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _queryLicenceCertificateLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _queryLicenceCertificateLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _queryLicenceCertificateLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _queryLicenceCertificateLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the query licence certificate with the primary key.
	 *
	 * @param queryLicenceCertificateId the primary key of the query licence certificate
	 * @return the query licence certificate
	 * @throws PortalException if a query licence certificate with the primary key could not be found
	 */
	@Override
	public com.nbp.quarry.stage.service.model.QueryLicenceCertificate
			getQueryLicenceCertificate(long queryLicenceCertificateId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _queryLicenceCertificateLocalService.getQueryLicenceCertificate(
			queryLicenceCertificateId);
	}

	@Override
	public com.nbp.quarry.stage.service.model.QueryLicenceCertificate
			getQueryLicenceCertificateBy_CI(String caseId)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQueryLicenceCertificateException {

		return _queryLicenceCertificateLocalService.
			getQueryLicenceCertificateBy_CI(caseId);
	}

	/**
	 * Returns a range of all the query licence certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quarry.stage.service.model.impl.QueryLicenceCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of query licence certificates
	 * @param end the upper bound of the range of query licence certificates (not inclusive)
	 * @return the range of query licence certificates
	 */
	@Override
	public java.util.List
		<com.nbp.quarry.stage.service.model.QueryLicenceCertificate>
			getQueryLicenceCertificates(int start, int end) {

		return _queryLicenceCertificateLocalService.getQueryLicenceCertificates(
			start, end);
	}

	/**
	 * Returns the number of query licence certificates.
	 *
	 * @return the number of query licence certificates
	 */
	@Override
	public int getQueryLicenceCertificatesCount() {
		return _queryLicenceCertificateLocalService.
			getQueryLicenceCertificatesCount();
	}

	/**
	 * Updates the query licence certificate in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QueryLicenceCertificateLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param queryLicenceCertificate the query licence certificate
	 * @return the query licence certificate that was updated
	 */
	@Override
	public com.nbp.quarry.stage.service.model.QueryLicenceCertificate
		updateQueryLicenceCertificate(
			com.nbp.quarry.stage.service.model.QueryLicenceCertificate
				queryLicenceCertificate) {

		return _queryLicenceCertificateLocalService.
			updateQueryLicenceCertificate(queryLicenceCertificate);
	}

	@Override
	public com.nbp.quarry.stage.service.model.QueryLicenceCertificate
		updateQueryLicenceCertificate(
			String caseId, String licenceCertificate, String category,
			java.util.Date issueDate, java.util.Date expirationDate,
			String status) {

		return _queryLicenceCertificateLocalService.
			updateQueryLicenceCertificate(
				caseId, licenceCertificate, category, issueDate, expirationDate,
				status);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _queryLicenceCertificateLocalService.getBasePersistence();
	}

	@Override
	public QueryLicenceCertificateLocalService getWrappedService() {
		return _queryLicenceCertificateLocalService;
	}

	@Override
	public void setWrappedService(
		QueryLicenceCertificateLocalService
			queryLicenceCertificateLocalService) {

		_queryLicenceCertificateLocalService =
			queryLicenceCertificateLocalService;
	}

	private QueryLicenceCertificateLocalService
		_queryLicenceCertificateLocalService;

}