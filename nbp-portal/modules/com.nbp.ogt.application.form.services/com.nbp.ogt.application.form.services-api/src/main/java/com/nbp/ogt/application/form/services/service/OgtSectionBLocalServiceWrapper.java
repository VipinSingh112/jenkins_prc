/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ogt.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link OgtSectionBLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see OgtSectionBLocalService
 * @generated
 */
public class OgtSectionBLocalServiceWrapper
	implements OgtSectionBLocalService,
			   ServiceWrapper<OgtSectionBLocalService> {

	public OgtSectionBLocalServiceWrapper() {
		this(null);
	}

	public OgtSectionBLocalServiceWrapper(
		OgtSectionBLocalService ogtSectionBLocalService) {

		_ogtSectionBLocalService = ogtSectionBLocalService;
	}

	/**
	 * Adds the ogt section b to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OgtSectionBLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ogtSectionB the ogt section b
	 * @return the ogt section b that was added
	 */
	@Override
	public com.nbp.ogt.application.form.services.model.OgtSectionB
		addOgtSectionB(
			com.nbp.ogt.application.form.services.model.OgtSectionB
				ogtSectionB) {

		return _ogtSectionBLocalService.addOgtSectionB(ogtSectionB);
	}

	/**
	 * Creates a new ogt section b with the primary key. Does not add the ogt section b to the database.
	 *
	 * @param ogtSectionBId the primary key for the new ogt section b
	 * @return the new ogt section b
	 */
	@Override
	public com.nbp.ogt.application.form.services.model.OgtSectionB
		createOgtSectionB(long ogtSectionBId) {

		return _ogtSectionBLocalService.createOgtSectionB(ogtSectionBId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ogtSectionBLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the ogt section b with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OgtSectionBLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ogtSectionBId the primary key of the ogt section b
	 * @return the ogt section b that was removed
	 * @throws PortalException if a ogt section b with the primary key could not be found
	 */
	@Override
	public com.nbp.ogt.application.form.services.model.OgtSectionB
			deleteOgtSectionB(long ogtSectionBId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ogtSectionBLocalService.deleteOgtSectionB(ogtSectionBId);
	}

	/**
	 * Deletes the ogt section b from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OgtSectionBLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ogtSectionB the ogt section b
	 * @return the ogt section b that was removed
	 */
	@Override
	public com.nbp.ogt.application.form.services.model.OgtSectionB
		deleteOgtSectionB(
			com.nbp.ogt.application.form.services.model.OgtSectionB
				ogtSectionB) {

		return _ogtSectionBLocalService.deleteOgtSectionB(ogtSectionB);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ogtSectionBLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _ogtSectionBLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _ogtSectionBLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _ogtSectionBLocalService.dynamicQuery();
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

		return _ogtSectionBLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ogt.application.form.services.model.impl.OgtSectionBModelImpl</code>.
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

		return _ogtSectionBLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ogt.application.form.services.model.impl.OgtSectionBModelImpl</code>.
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

		return _ogtSectionBLocalService.dynamicQuery(
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

		return _ogtSectionBLocalService.dynamicQueryCount(dynamicQuery);
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

		return _ogtSectionBLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.ogt.application.form.services.model.OgtSectionB
		fetchOgtSectionB(long ogtSectionBId) {

		return _ogtSectionBLocalService.fetchOgtSectionB(ogtSectionBId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _ogtSectionBLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _ogtSectionBLocalService.getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.ogt.application.form.services.model.OgtSectionB getOgtById(
			long ogtApplicationId)
		throws com.nbp.ogt.application.form.services.exception.
			NoSuchOgtSectionBException {

		return _ogtSectionBLocalService.getOgtById(ogtApplicationId);
	}

	/**
	 * Returns the ogt section b with the primary key.
	 *
	 * @param ogtSectionBId the primary key of the ogt section b
	 * @return the ogt section b
	 * @throws PortalException if a ogt section b with the primary key could not be found
	 */
	@Override
	public com.nbp.ogt.application.form.services.model.OgtSectionB
			getOgtSectionB(long ogtSectionBId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ogtSectionBLocalService.getOgtSectionB(ogtSectionBId);
	}

	/**
	 * Returns a range of all the ogt section bs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ogt.application.form.services.model.impl.OgtSectionBModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt section bs
	 * @param end the upper bound of the range of ogt section bs (not inclusive)
	 * @return the range of ogt section bs
	 */
	@Override
	public java.util.List
		<com.nbp.ogt.application.form.services.model.OgtSectionB>
			getOgtSectionBs(int start, int end) {

		return _ogtSectionBLocalService.getOgtSectionBs(start, end);
	}

	/**
	 * Returns the number of ogt section bs.
	 *
	 * @return the number of ogt section bs
	 */
	@Override
	public int getOgtSectionBsCount() {
		return _ogtSectionBLocalService.getOgtSectionBsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ogtSectionBLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ogtSectionBLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the ogt section b in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OgtSectionBLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ogtSectionB the ogt section b
	 * @return the ogt section b that was updated
	 */
	@Override
	public com.nbp.ogt.application.form.services.model.OgtSectionB
		updateOgtSectionB(
			com.nbp.ogt.application.form.services.model.OgtSectionB
				ogtSectionB) {

		return _ogtSectionBLocalService.updateOgtSectionB(ogtSectionB);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _ogtSectionBLocalService.getBasePersistence();
	}

	@Override
	public OgtSectionBLocalService getWrappedService() {
		return _ogtSectionBLocalService;
	}

	@Override
	public void setWrappedService(
		OgtSectionBLocalService ogtSectionBLocalService) {

		_ogtSectionBLocalService = ogtSectionBLocalService;
	}

	private OgtSectionBLocalService _ogtSectionBLocalService;

}