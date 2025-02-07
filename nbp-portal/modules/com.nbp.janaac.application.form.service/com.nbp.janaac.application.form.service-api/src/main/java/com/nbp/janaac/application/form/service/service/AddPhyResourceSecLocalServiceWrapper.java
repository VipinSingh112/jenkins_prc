/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AddPhyResourceSecLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AddPhyResourceSecLocalService
 * @generated
 */
public class AddPhyResourceSecLocalServiceWrapper
	implements AddPhyResourceSecLocalService,
			   ServiceWrapper<AddPhyResourceSecLocalService> {

	public AddPhyResourceSecLocalServiceWrapper() {
		this(null);
	}

	public AddPhyResourceSecLocalServiceWrapper(
		AddPhyResourceSecLocalService addPhyResourceSecLocalService) {

		_addPhyResourceSecLocalService = addPhyResourceSecLocalService;
	}

	/**
	 * Adds the add phy resource sec to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddPhyResourceSecLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addPhyResourceSec the add phy resource sec
	 * @return the add phy resource sec that was added
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddPhyResourceSec
		addAddPhyResourceSec(
			com.nbp.janaac.application.form.service.model.AddPhyResourceSec
				addPhyResourceSec) {

		return _addPhyResourceSecLocalService.addAddPhyResourceSec(
			addPhyResourceSec);
	}

	/**
	 * Creates a new add phy resource sec with the primary key. Does not add the add phy resource sec to the database.
	 *
	 * @param addPhyResourceSecId the primary key for the new add phy resource sec
	 * @return the new add phy resource sec
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddPhyResourceSec
		createAddPhyResourceSec(long addPhyResourceSecId) {

		return _addPhyResourceSecLocalService.createAddPhyResourceSec(
			addPhyResourceSecId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addPhyResourceSecLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the add phy resource sec from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddPhyResourceSecLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addPhyResourceSec the add phy resource sec
	 * @return the add phy resource sec that was removed
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddPhyResourceSec
		deleteAddPhyResourceSec(
			com.nbp.janaac.application.form.service.model.AddPhyResourceSec
				addPhyResourceSec) {

		return _addPhyResourceSecLocalService.deleteAddPhyResourceSec(
			addPhyResourceSec);
	}

	/**
	 * Deletes the add phy resource sec with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddPhyResourceSecLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addPhyResourceSecId the primary key of the add phy resource sec
	 * @return the add phy resource sec that was removed
	 * @throws PortalException if a add phy resource sec with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddPhyResourceSec
			deleteAddPhyResourceSec(long addPhyResourceSecId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addPhyResourceSecLocalService.deleteAddPhyResourceSec(
			addPhyResourceSecId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addPhyResourceSecLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _addPhyResourceSecLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _addPhyResourceSecLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _addPhyResourceSecLocalService.dynamicQuery();
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

		return _addPhyResourceSecLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddPhyResourceSecModelImpl</code>.
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

		return _addPhyResourceSecLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddPhyResourceSecModelImpl</code>.
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

		return _addPhyResourceSecLocalService.dynamicQuery(
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

		return _addPhyResourceSecLocalService.dynamicQueryCount(dynamicQuery);
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

		return _addPhyResourceSecLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.janaac.application.form.service.model.AddPhyResourceSec
		fetchAddPhyResourceSec(long addPhyResourceSecId) {

		return _addPhyResourceSecLocalService.fetchAddPhyResourceSec(
			addPhyResourceSecId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _addPhyResourceSecLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the add phy resource sec with the primary key.
	 *
	 * @param addPhyResourceSecId the primary key of the add phy resource sec
	 * @return the add phy resource sec
	 * @throws PortalException if a add phy resource sec with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddPhyResourceSec
			getAddPhyResourceSec(long addPhyResourceSecId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addPhyResourceSecLocalService.getAddPhyResourceSec(
			addPhyResourceSecId);
	}

	/**
	 * Returns a range of all the add phy resource secs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddPhyResourceSecModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add phy resource secs
	 * @param end the upper bound of the range of add phy resource secs (not inclusive)
	 * @return the range of add phy resource secs
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AddPhyResourceSec>
			getAddPhyResourceSecs(int start, int end) {

		return _addPhyResourceSecLocalService.getAddPhyResourceSecs(start, end);
	}

	/**
	 * Returns the number of add phy resource secs.
	 *
	 * @return the number of add phy resource secs
	 */
	@Override
	public int getAddPhyResourceSecsCount() {
		return _addPhyResourceSecLocalService.getAddPhyResourceSecsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _addPhyResourceSecLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AddPhyResourceSec>
			getJANAAC_ByApplicationId(long janaacApplicationId) {

		return _addPhyResourceSecLocalService.getJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _addPhyResourceSecLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addPhyResourceSecLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the add phy resource sec in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddPhyResourceSecLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addPhyResourceSec the add phy resource sec
	 * @return the add phy resource sec that was updated
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddPhyResourceSec
		updateAddPhyResourceSec(
			com.nbp.janaac.application.form.service.model.AddPhyResourceSec
				addPhyResourceSec) {

		return _addPhyResourceSecLocalService.updateAddPhyResourceSec(
			addPhyResourceSec);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _addPhyResourceSecLocalService.getBasePersistence();
	}

	@Override
	public AddPhyResourceSecLocalService getWrappedService() {
		return _addPhyResourceSecLocalService;
	}

	@Override
	public void setWrappedService(
		AddPhyResourceSecLocalService addPhyResourceSecLocalService) {

		_addPhyResourceSecLocalService = addPhyResourceSecLocalService;
	}

	private AddPhyResourceSecLocalService _addPhyResourceSecLocalService;

}