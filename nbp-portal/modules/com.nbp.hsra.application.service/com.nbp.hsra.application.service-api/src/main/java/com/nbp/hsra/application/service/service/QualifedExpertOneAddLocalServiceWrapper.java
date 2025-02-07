/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link QualifedExpertOneAddLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see QualifedExpertOneAddLocalService
 * @generated
 */
public class QualifedExpertOneAddLocalServiceWrapper
	implements QualifedExpertOneAddLocalService,
			   ServiceWrapper<QualifedExpertOneAddLocalService> {

	public QualifedExpertOneAddLocalServiceWrapper() {
		this(null);
	}

	public QualifedExpertOneAddLocalServiceWrapper(
		QualifedExpertOneAddLocalService qualifedExpertOneAddLocalService) {

		_qualifedExpertOneAddLocalService = qualifedExpertOneAddLocalService;
	}

	/**
	 * Adds the qualifed expert one add to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QualifedExpertOneAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param qualifedExpertOneAdd the qualifed expert one add
	 * @return the qualifed expert one add that was added
	 */
	@Override
	public com.nbp.hsra.application.service.model.QualifedExpertOneAdd
		addQualifedExpertOneAdd(
			com.nbp.hsra.application.service.model.QualifedExpertOneAdd
				qualifedExpertOneAdd) {

		return _qualifedExpertOneAddLocalService.addQualifedExpertOneAdd(
			qualifedExpertOneAdd);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _qualifedExpertOneAddLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new qualifed expert one add with the primary key. Does not add the qualifed expert one add to the database.
	 *
	 * @param qualifedExpertOneAddId the primary key for the new qualifed expert one add
	 * @return the new qualifed expert one add
	 */
	@Override
	public com.nbp.hsra.application.service.model.QualifedExpertOneAdd
		createQualifedExpertOneAdd(long qualifedExpertOneAddId) {

		return _qualifedExpertOneAddLocalService.createQualifedExpertOneAdd(
			qualifedExpertOneAddId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _qualifedExpertOneAddLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the qualifed expert one add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QualifedExpertOneAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param qualifedExpertOneAddId the primary key of the qualifed expert one add
	 * @return the qualifed expert one add that was removed
	 * @throws PortalException if a qualifed expert one add with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.QualifedExpertOneAdd
			deleteQualifedExpertOneAdd(long qualifedExpertOneAddId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _qualifedExpertOneAddLocalService.deleteQualifedExpertOneAdd(
			qualifedExpertOneAddId);
	}

	/**
	 * Deletes the qualifed expert one add from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QualifedExpertOneAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param qualifedExpertOneAdd the qualifed expert one add
	 * @return the qualifed expert one add that was removed
	 */
	@Override
	public com.nbp.hsra.application.service.model.QualifedExpertOneAdd
		deleteQualifedExpertOneAdd(
			com.nbp.hsra.application.service.model.QualifedExpertOneAdd
				qualifedExpertOneAdd) {

		return _qualifedExpertOneAddLocalService.deleteQualifedExpertOneAdd(
			qualifedExpertOneAdd);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _qualifedExpertOneAddLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _qualifedExpertOneAddLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _qualifedExpertOneAddLocalService.dynamicQuery();
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

		return _qualifedExpertOneAddLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.QualifedExpertOneAddModelImpl</code>.
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

		return _qualifedExpertOneAddLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.QualifedExpertOneAddModelImpl</code>.
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

		return _qualifedExpertOneAddLocalService.dynamicQuery(
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

		return _qualifedExpertOneAddLocalService.dynamicQueryCount(
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

		return _qualifedExpertOneAddLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.hsra.application.service.model.QualifedExpertOneAdd
		fetchQualifedExpertOneAdd(long qualifedExpertOneAddId) {

		return _qualifedExpertOneAddLocalService.fetchQualifedExpertOneAdd(
			qualifedExpertOneAddId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _qualifedExpertOneAddLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.hsra.application.service.model.QualifedExpertOneAdd>
			getHsraById(long hsraApplicationId) {

		return _qualifedExpertOneAddLocalService.getHsraById(hsraApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _qualifedExpertOneAddLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _qualifedExpertOneAddLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _qualifedExpertOneAddLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the qualifed expert one add with the primary key.
	 *
	 * @param qualifedExpertOneAddId the primary key of the qualifed expert one add
	 * @return the qualifed expert one add
	 * @throws PortalException if a qualifed expert one add with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.QualifedExpertOneAdd
			getQualifedExpertOneAdd(long qualifedExpertOneAddId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _qualifedExpertOneAddLocalService.getQualifedExpertOneAdd(
			qualifedExpertOneAddId);
	}

	/**
	 * Returns a range of all the qualifed expert one adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.QualifedExpertOneAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of qualifed expert one adds
	 * @param end the upper bound of the range of qualifed expert one adds (not inclusive)
	 * @return the range of qualifed expert one adds
	 */
	@Override
	public java.util.List
		<com.nbp.hsra.application.service.model.QualifedExpertOneAdd>
			getQualifedExpertOneAdds(int start, int end) {

		return _qualifedExpertOneAddLocalService.getQualifedExpertOneAdds(
			start, end);
	}

	/**
	 * Returns the number of qualifed expert one adds.
	 *
	 * @return the number of qualifed expert one adds
	 */
	@Override
	public int getQualifedExpertOneAddsCount() {
		return _qualifedExpertOneAddLocalService.
			getQualifedExpertOneAddsCount();
	}

	/**
	 * Updates the qualifed expert one add in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QualifedExpertOneAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param qualifedExpertOneAdd the qualifed expert one add
	 * @return the qualifed expert one add that was updated
	 */
	@Override
	public com.nbp.hsra.application.service.model.QualifedExpertOneAdd
		updateQualifedExpertOneAdd(
			com.nbp.hsra.application.service.model.QualifedExpertOneAdd
				qualifedExpertOneAdd) {

		return _qualifedExpertOneAddLocalService.updateQualifedExpertOneAdd(
			qualifedExpertOneAdd);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _qualifedExpertOneAddLocalService.getBasePersistence();
	}

	@Override
	public QualifedExpertOneAddLocalService getWrappedService() {
		return _qualifedExpertOneAddLocalService;
	}

	@Override
	public void setWrappedService(
		QualifedExpertOneAddLocalService qualifedExpertOneAddLocalService) {

		_qualifedExpertOneAddLocalService = qualifedExpertOneAddLocalService;
	}

	private QualifedExpertOneAddLocalService _qualifedExpertOneAddLocalService;

}