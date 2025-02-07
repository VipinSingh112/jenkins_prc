/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AddLabResourceReqFirstLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AddLabResourceReqFirstLocalService
 * @generated
 */
public class AddLabResourceReqFirstLocalServiceWrapper
	implements AddLabResourceReqFirstLocalService,
			   ServiceWrapper<AddLabResourceReqFirstLocalService> {

	public AddLabResourceReqFirstLocalServiceWrapper() {
		this(null);
	}

	public AddLabResourceReqFirstLocalServiceWrapper(
		AddLabResourceReqFirstLocalService addLabResourceReqFirstLocalService) {

		_addLabResourceReqFirstLocalService =
			addLabResourceReqFirstLocalService;
	}

	/**
	 * Adds the add lab resource req first to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddLabResourceReqFirstLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addLabResourceReqFirst the add lab resource req first
	 * @return the add lab resource req first that was added
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddLabResourceReqFirst
		addAddLabResourceReqFirst(
			com.nbp.janaac.application.form.service.model.AddLabResourceReqFirst
				addLabResourceReqFirst) {

		return _addLabResourceReqFirstLocalService.addAddLabResourceReqFirst(
			addLabResourceReqFirst);
	}

	/**
	 * Creates a new add lab resource req first with the primary key. Does not add the add lab resource req first to the database.
	 *
	 * @param addLabResourceReqFirstId the primary key for the new add lab resource req first
	 * @return the new add lab resource req first
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddLabResourceReqFirst
		createAddLabResourceReqFirst(long addLabResourceReqFirstId) {

		return _addLabResourceReqFirstLocalService.createAddLabResourceReqFirst(
			addLabResourceReqFirstId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addLabResourceReqFirstLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the add lab resource req first from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddLabResourceReqFirstLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addLabResourceReqFirst the add lab resource req first
	 * @return the add lab resource req first that was removed
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddLabResourceReqFirst
		deleteAddLabResourceReqFirst(
			com.nbp.janaac.application.form.service.model.AddLabResourceReqFirst
				addLabResourceReqFirst) {

		return _addLabResourceReqFirstLocalService.deleteAddLabResourceReqFirst(
			addLabResourceReqFirst);
	}

	/**
	 * Deletes the add lab resource req first with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddLabResourceReqFirstLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addLabResourceReqFirstId the primary key of the add lab resource req first
	 * @return the add lab resource req first that was removed
	 * @throws PortalException if a add lab resource req first with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddLabResourceReqFirst
			deleteAddLabResourceReqFirst(long addLabResourceReqFirstId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addLabResourceReqFirstLocalService.deleteAddLabResourceReqFirst(
			addLabResourceReqFirstId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addLabResourceReqFirstLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _addLabResourceReqFirstLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _addLabResourceReqFirstLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _addLabResourceReqFirstLocalService.dynamicQuery();
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

		return _addLabResourceReqFirstLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddLabResourceReqFirstModelImpl</code>.
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

		return _addLabResourceReqFirstLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddLabResourceReqFirstModelImpl</code>.
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

		return _addLabResourceReqFirstLocalService.dynamicQuery(
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

		return _addLabResourceReqFirstLocalService.dynamicQueryCount(
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

		return _addLabResourceReqFirstLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.janaac.application.form.service.model.AddLabResourceReqFirst
		fetchAddLabResourceReqFirst(long addLabResourceReqFirstId) {

		return _addLabResourceReqFirstLocalService.fetchAddLabResourceReqFirst(
			addLabResourceReqFirstId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _addLabResourceReqFirstLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the add lab resource req first with the primary key.
	 *
	 * @param addLabResourceReqFirstId the primary key of the add lab resource req first
	 * @return the add lab resource req first
	 * @throws PortalException if a add lab resource req first with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddLabResourceReqFirst
			getAddLabResourceReqFirst(long addLabResourceReqFirstId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addLabResourceReqFirstLocalService.getAddLabResourceReqFirst(
			addLabResourceReqFirstId);
	}

	/**
	 * Returns a range of all the add lab resource req firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddLabResourceReqFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab resource req firsts
	 * @param end the upper bound of the range of add lab resource req firsts (not inclusive)
	 * @return the range of add lab resource req firsts
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AddLabResourceReqFirst>
			getAddLabResourceReqFirsts(int start, int end) {

		return _addLabResourceReqFirstLocalService.getAddLabResourceReqFirsts(
			start, end);
	}

	/**
	 * Returns the number of add lab resource req firsts.
	 *
	 * @return the number of add lab resource req firsts
	 */
	@Override
	public int getAddLabResourceReqFirstsCount() {
		return _addLabResourceReqFirstLocalService.
			getAddLabResourceReqFirstsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _addLabResourceReqFirstLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AddLabResourceReqFirst>
			getJanaacById(long janaacApplicationId) {

		return _addLabResourceReqFirstLocalService.getJanaacById(
			janaacApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _addLabResourceReqFirstLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addLabResourceReqFirstLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the add lab resource req first in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddLabResourceReqFirstLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addLabResourceReqFirst the add lab resource req first
	 * @return the add lab resource req first that was updated
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddLabResourceReqFirst
		updateAddLabResourceReqFirst(
			com.nbp.janaac.application.form.service.model.AddLabResourceReqFirst
				addLabResourceReqFirst) {

		return _addLabResourceReqFirstLocalService.updateAddLabResourceReqFirst(
			addLabResourceReqFirst);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _addLabResourceReqFirstLocalService.getBasePersistence();
	}

	@Override
	public AddLabResourceReqFirstLocalService getWrappedService() {
		return _addLabResourceReqFirstLocalService;
	}

	@Override
	public void setWrappedService(
		AddLabResourceReqFirstLocalService addLabResourceReqFirstLocalService) {

		_addLabResourceReqFirstLocalService =
			addLabResourceReqFirstLocalService;
	}

	private AddLabResourceReqFirstLocalService
		_addLabResourceReqFirstLocalService;

}