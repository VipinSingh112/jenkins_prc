/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AddLabResourceReqSecLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AddLabResourceReqSecLocalService
 * @generated
 */
public class AddLabResourceReqSecLocalServiceWrapper
	implements AddLabResourceReqSecLocalService,
			   ServiceWrapper<AddLabResourceReqSecLocalService> {

	public AddLabResourceReqSecLocalServiceWrapper() {
		this(null);
	}

	public AddLabResourceReqSecLocalServiceWrapper(
		AddLabResourceReqSecLocalService addLabResourceReqSecLocalService) {

		_addLabResourceReqSecLocalService = addLabResourceReqSecLocalService;
	}

	/**
	 * Adds the add lab resource req sec to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddLabResourceReqSecLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addLabResourceReqSec the add lab resource req sec
	 * @return the add lab resource req sec that was added
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddLabResourceReqSec
		addAddLabResourceReqSec(
			com.nbp.janaac.application.form.service.model.AddLabResourceReqSec
				addLabResourceReqSec) {

		return _addLabResourceReqSecLocalService.addAddLabResourceReqSec(
			addLabResourceReqSec);
	}

	/**
	 * Creates a new add lab resource req sec with the primary key. Does not add the add lab resource req sec to the database.
	 *
	 * @param addLabResourceReqSecId the primary key for the new add lab resource req sec
	 * @return the new add lab resource req sec
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddLabResourceReqSec
		createAddLabResourceReqSec(long addLabResourceReqSecId) {

		return _addLabResourceReqSecLocalService.createAddLabResourceReqSec(
			addLabResourceReqSecId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addLabResourceReqSecLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the add lab resource req sec from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddLabResourceReqSecLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addLabResourceReqSec the add lab resource req sec
	 * @return the add lab resource req sec that was removed
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddLabResourceReqSec
		deleteAddLabResourceReqSec(
			com.nbp.janaac.application.form.service.model.AddLabResourceReqSec
				addLabResourceReqSec) {

		return _addLabResourceReqSecLocalService.deleteAddLabResourceReqSec(
			addLabResourceReqSec);
	}

	/**
	 * Deletes the add lab resource req sec with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddLabResourceReqSecLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addLabResourceReqSecId the primary key of the add lab resource req sec
	 * @return the add lab resource req sec that was removed
	 * @throws PortalException if a add lab resource req sec with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddLabResourceReqSec
			deleteAddLabResourceReqSec(long addLabResourceReqSecId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addLabResourceReqSecLocalService.deleteAddLabResourceReqSec(
			addLabResourceReqSecId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addLabResourceReqSecLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _addLabResourceReqSecLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _addLabResourceReqSecLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _addLabResourceReqSecLocalService.dynamicQuery();
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

		return _addLabResourceReqSecLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddLabResourceReqSecModelImpl</code>.
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

		return _addLabResourceReqSecLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddLabResourceReqSecModelImpl</code>.
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

		return _addLabResourceReqSecLocalService.dynamicQuery(
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

		return _addLabResourceReqSecLocalService.dynamicQueryCount(
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

		return _addLabResourceReqSecLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.janaac.application.form.service.model.AddLabResourceReqSec
		fetchAddLabResourceReqSec(long addLabResourceReqSecId) {

		return _addLabResourceReqSecLocalService.fetchAddLabResourceReqSec(
			addLabResourceReqSecId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _addLabResourceReqSecLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the add lab resource req sec with the primary key.
	 *
	 * @param addLabResourceReqSecId the primary key of the add lab resource req sec
	 * @return the add lab resource req sec
	 * @throws PortalException if a add lab resource req sec with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddLabResourceReqSec
			getAddLabResourceReqSec(long addLabResourceReqSecId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addLabResourceReqSecLocalService.getAddLabResourceReqSec(
			addLabResourceReqSecId);
	}

	/**
	 * Returns a range of all the add lab resource req secs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddLabResourceReqSecModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab resource req secs
	 * @param end the upper bound of the range of add lab resource req secs (not inclusive)
	 * @return the range of add lab resource req secs
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AddLabResourceReqSec>
			getAddLabResourceReqSecs(int start, int end) {

		return _addLabResourceReqSecLocalService.getAddLabResourceReqSecs(
			start, end);
	}

	/**
	 * Returns the number of add lab resource req secs.
	 *
	 * @return the number of add lab resource req secs
	 */
	@Override
	public int getAddLabResourceReqSecsCount() {
		return _addLabResourceReqSecLocalService.
			getAddLabResourceReqSecsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _addLabResourceReqSecLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AddLabResourceReqSec>
			getJanaacById(long janaacApplicationId) {

		return _addLabResourceReqSecLocalService.getJanaacById(
			janaacApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _addLabResourceReqSecLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addLabResourceReqSecLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the add lab resource req sec in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddLabResourceReqSecLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addLabResourceReqSec the add lab resource req sec
	 * @return the add lab resource req sec that was updated
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddLabResourceReqSec
		updateAddLabResourceReqSec(
			com.nbp.janaac.application.form.service.model.AddLabResourceReqSec
				addLabResourceReqSec) {

		return _addLabResourceReqSecLocalService.updateAddLabResourceReqSec(
			addLabResourceReqSec);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _addLabResourceReqSecLocalService.getBasePersistence();
	}

	@Override
	public AddLabResourceReqSecLocalService getWrappedService() {
		return _addLabResourceReqSecLocalService;
	}

	@Override
	public void setWrappedService(
		AddLabResourceReqSecLocalService addLabResourceReqSecLocalService) {

		_addLabResourceReqSecLocalService = addLabResourceReqSecLocalService;
	}

	private AddLabResourceReqSecLocalService _addLabResourceReqSecLocalService;

}