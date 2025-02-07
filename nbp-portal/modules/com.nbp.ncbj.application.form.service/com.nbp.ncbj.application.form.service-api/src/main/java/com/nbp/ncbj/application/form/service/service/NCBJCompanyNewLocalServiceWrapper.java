/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link NCBJCompanyNewLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see NCBJCompanyNewLocalService
 * @generated
 */
public class NCBJCompanyNewLocalServiceWrapper
	implements NCBJCompanyNewLocalService,
			   ServiceWrapper<NCBJCompanyNewLocalService> {

	public NCBJCompanyNewLocalServiceWrapper() {
		this(null);
	}

	public NCBJCompanyNewLocalServiceWrapper(
		NCBJCompanyNewLocalService ncbjCompanyNewLocalService) {

		_ncbjCompanyNewLocalService = ncbjCompanyNewLocalService;
	}

	/**
	 * Adds the ncbj company new to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NCBJCompanyNewLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjCompanyNew the ncbj company new
	 * @return the ncbj company new that was added
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NCBJCompanyNew
		addNCBJCompanyNew(
			com.nbp.ncbj.application.form.service.model.NCBJCompanyNew
				ncbjCompanyNew) {

		return _ncbjCompanyNewLocalService.addNCBJCompanyNew(ncbjCompanyNew);
	}

	/**
	 * Creates a new ncbj company new with the primary key. Does not add the ncbj company new to the database.
	 *
	 * @param nCBJCompanyNewId the primary key for the new ncbj company new
	 * @return the new ncbj company new
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NCBJCompanyNew
		createNCBJCompanyNew(long nCBJCompanyNewId) {

		return _ncbjCompanyNewLocalService.createNCBJCompanyNew(
			nCBJCompanyNewId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjCompanyNewLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the ncbj company new with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NCBJCompanyNewLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param nCBJCompanyNewId the primary key of the ncbj company new
	 * @return the ncbj company new that was removed
	 * @throws PortalException if a ncbj company new with the primary key could not be found
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NCBJCompanyNew
			deleteNCBJCompanyNew(long nCBJCompanyNewId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjCompanyNewLocalService.deleteNCBJCompanyNew(
			nCBJCompanyNewId);
	}

	/**
	 * Deletes the ncbj company new from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NCBJCompanyNewLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjCompanyNew the ncbj company new
	 * @return the ncbj company new that was removed
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NCBJCompanyNew
		deleteNCBJCompanyNew(
			com.nbp.ncbj.application.form.service.model.NCBJCompanyNew
				ncbjCompanyNew) {

		return _ncbjCompanyNewLocalService.deleteNCBJCompanyNew(ncbjCompanyNew);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjCompanyNewLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _ncbjCompanyNewLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _ncbjCompanyNewLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _ncbjCompanyNewLocalService.dynamicQuery();
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

		return _ncbjCompanyNewLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NCBJCompanyNewModelImpl</code>.
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

		return _ncbjCompanyNewLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NCBJCompanyNewModelImpl</code>.
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

		return _ncbjCompanyNewLocalService.dynamicQuery(
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

		return _ncbjCompanyNewLocalService.dynamicQueryCount(dynamicQuery);
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

		return _ncbjCompanyNewLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.ncbj.application.form.service.model.NCBJCompanyNew
		fetchNCBJCompanyNew(long nCBJCompanyNewId) {

		return _ncbjCompanyNewLocalService.fetchNCBJCompanyNew(
			nCBJCompanyNewId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _ncbjCompanyNewLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _ncbjCompanyNewLocalService.getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.ncbj.application.form.service.model.NCBJCompanyNew
			getNCBJById(long ncbjApplicationId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNCBJCompanyNewException {

		return _ncbjCompanyNewLocalService.getNCBJById(ncbjApplicationId);
	}

	/**
	 * Returns the ncbj company new with the primary key.
	 *
	 * @param nCBJCompanyNewId the primary key of the ncbj company new
	 * @return the ncbj company new
	 * @throws PortalException if a ncbj company new with the primary key could not be found
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NCBJCompanyNew
			getNCBJCompanyNew(long nCBJCompanyNewId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjCompanyNewLocalService.getNCBJCompanyNew(nCBJCompanyNewId);
	}

	/**
	 * Returns a range of all the ncbj company news.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NCBJCompanyNewModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj company news
	 * @param end the upper bound of the range of ncbj company news (not inclusive)
	 * @return the range of ncbj company news
	 */
	@Override
	public java.util.List
		<com.nbp.ncbj.application.form.service.model.NCBJCompanyNew>
			getNCBJCompanyNews(int start, int end) {

		return _ncbjCompanyNewLocalService.getNCBJCompanyNews(start, end);
	}

	/**
	 * Returns the number of ncbj company news.
	 *
	 * @return the number of ncbj company news
	 */
	@Override
	public int getNCBJCompanyNewsCount() {
		return _ncbjCompanyNewLocalService.getNCBJCompanyNewsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ncbjCompanyNewLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjCompanyNewLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the ncbj company new in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NCBJCompanyNewLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjCompanyNew the ncbj company new
	 * @return the ncbj company new that was updated
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NCBJCompanyNew
		updateNCBJCompanyNew(
			com.nbp.ncbj.application.form.service.model.NCBJCompanyNew
				ncbjCompanyNew) {

		return _ncbjCompanyNewLocalService.updateNCBJCompanyNew(ncbjCompanyNew);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _ncbjCompanyNewLocalService.getBasePersistence();
	}

	@Override
	public NCBJCompanyNewLocalService getWrappedService() {
		return _ncbjCompanyNewLocalService;
	}

	@Override
	public void setWrappedService(
		NCBJCompanyNewLocalService ncbjCompanyNewLocalService) {

		_ncbjCompanyNewLocalService = ncbjCompanyNewLocalService;
	}

	private NCBJCompanyNewLocalService _ncbjCompanyNewLocalService;

}