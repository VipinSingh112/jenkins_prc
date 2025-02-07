/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.tourism.application.form.services.exception.NoSuchTourismNewAccommodationFormException;
import com.nbp.tourism.application.form.services.model.TourismNewAccommodationForm;
import com.nbp.tourism.application.form.services.model.TourismNewAccommodationFormTable;
import com.nbp.tourism.application.form.services.model.impl.TourismNewAccommodationFormImpl;
import com.nbp.tourism.application.form.services.model.impl.TourismNewAccommodationFormModelImpl;
import com.nbp.tourism.application.form.services.service.persistence.TourismNewAccommodationFormPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismNewAccommodationFormUtil;
import com.nbp.tourism.application.form.services.service.persistence.impl.constants.TOURISMPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the tourism new accommodation form service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = TourismNewAccommodationFormPersistence.class)
public class TourismNewAccommodationFormPersistenceImpl
	extends BasePersistenceImpl<TourismNewAccommodationForm>
	implements TourismNewAccommodationFormPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>TourismNewAccommodationFormUtil</code> to access the tourism new accommodation form persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		TourismNewAccommodationFormImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetTourismById;
	private FinderPath _finderPathCountBygetTourismById;

	/**
	 * Returns the tourism new accommodation form where tourismApplicationId = &#63; or throws a <code>NoSuchTourismNewAccommodationFormException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new accommodation form
	 * @throws NoSuchTourismNewAccommodationFormException if a matching tourism new accommodation form could not be found
	 */
	@Override
	public TourismNewAccommodationForm findBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismNewAccommodationFormException {

		TourismNewAccommodationForm tourismNewAccommodationForm =
			fetchBygetTourismById(tourismApplicationId);

		if (tourismNewAccommodationForm == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("tourismApplicationId=");
			sb.append(tourismApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchTourismNewAccommodationFormException(sb.toString());
		}

		return tourismNewAccommodationForm;
	}

	/**
	 * Returns the tourism new accommodation form where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new accommodation form, or <code>null</code> if a matching tourism new accommodation form could not be found
	 */
	@Override
	public TourismNewAccommodationForm fetchBygetTourismById(
		long tourismApplicationId) {

		return fetchBygetTourismById(tourismApplicationId, true);
	}

	/**
	 * Returns the tourism new accommodation form where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism new accommodation form, or <code>null</code> if a matching tourism new accommodation form could not be found
	 */
	@Override
	public TourismNewAccommodationForm fetchBygetTourismById(
		long tourismApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {tourismApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetTourismById, finderArgs, this);
		}

		if (result instanceof TourismNewAccommodationForm) {
			TourismNewAccommodationForm tourismNewAccommodationForm =
				(TourismNewAccommodationForm)result;

			if (tourismApplicationId !=
					tourismNewAccommodationForm.getTourismApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_TOURISMNEWACCOMMODATIONFORM_WHERE);

			sb.append(_FINDER_COLUMN_GETTOURISMBYID_TOURISMAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(tourismApplicationId);

				List<TourismNewAccommodationForm> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetTourismById, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									tourismApplicationId
								};
							}

							_log.warn(
								"TourismNewAccommodationFormPersistenceImpl.fetchBygetTourismById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					TourismNewAccommodationForm tourismNewAccommodationForm =
						list.get(0);

					result = tourismNewAccommodationForm;

					cacheResult(tourismNewAccommodationForm);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (TourismNewAccommodationForm)result;
		}
	}

	/**
	 * Removes the tourism new accommodation form where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism new accommodation form that was removed
	 */
	@Override
	public TourismNewAccommodationForm removeBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismNewAccommodationFormException {

		TourismNewAccommodationForm tourismNewAccommodationForm =
			findBygetTourismById(tourismApplicationId);

		return remove(tourismNewAccommodationForm);
	}

	/**
	 * Returns the number of tourism new accommodation forms where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism new accommodation forms
	 */
	@Override
	public int countBygetTourismById(long tourismApplicationId) {
		FinderPath finderPath = _finderPathCountBygetTourismById;

		Object[] finderArgs = new Object[] {tourismApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_TOURISMNEWACCOMMODATIONFORM_WHERE);

			sb.append(_FINDER_COLUMN_GETTOURISMBYID_TOURISMAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(tourismApplicationId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String
		_FINDER_COLUMN_GETTOURISMBYID_TOURISMAPPLICATIONID_2 =
			"tourismNewAccommodationForm.tourismApplicationId = ?";

	public TourismNewAccommodationFormPersistenceImpl() {
		setModelClass(TourismNewAccommodationForm.class);

		setModelImplClass(TourismNewAccommodationFormImpl.class);
		setModelPKClass(long.class);

		setTable(TourismNewAccommodationFormTable.INSTANCE);
	}

	/**
	 * Caches the tourism new accommodation form in the entity cache if it is enabled.
	 *
	 * @param tourismNewAccommodationForm the tourism new accommodation form
	 */
	@Override
	public void cacheResult(
		TourismNewAccommodationForm tourismNewAccommodationForm) {

		entityCache.putResult(
			TourismNewAccommodationFormImpl.class,
			tourismNewAccommodationForm.getPrimaryKey(),
			tourismNewAccommodationForm);

		finderCache.putResult(
			_finderPathFetchBygetTourismById,
			new Object[] {
				tourismNewAccommodationForm.getTourismApplicationId()
			},
			tourismNewAccommodationForm);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the tourism new accommodation forms in the entity cache if it is enabled.
	 *
	 * @param tourismNewAccommodationForms the tourism new accommodation forms
	 */
	@Override
	public void cacheResult(
		List<TourismNewAccommodationForm> tourismNewAccommodationForms) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (tourismNewAccommodationForms.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (TourismNewAccommodationForm tourismNewAccommodationForm :
				tourismNewAccommodationForms) {

			if (entityCache.getResult(
					TourismNewAccommodationFormImpl.class,
					tourismNewAccommodationForm.getPrimaryKey()) == null) {

				cacheResult(tourismNewAccommodationForm);
			}
		}
	}

	/**
	 * Clears the cache for all tourism new accommodation forms.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(TourismNewAccommodationFormImpl.class);

		finderCache.clearCache(TourismNewAccommodationFormImpl.class);
	}

	/**
	 * Clears the cache for the tourism new accommodation form.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		TourismNewAccommodationForm tourismNewAccommodationForm) {

		entityCache.removeResult(
			TourismNewAccommodationFormImpl.class, tourismNewAccommodationForm);
	}

	@Override
	public void clearCache(
		List<TourismNewAccommodationForm> tourismNewAccommodationForms) {

		for (TourismNewAccommodationForm tourismNewAccommodationForm :
				tourismNewAccommodationForms) {

			entityCache.removeResult(
				TourismNewAccommodationFormImpl.class,
				tourismNewAccommodationForm);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(TourismNewAccommodationFormImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				TourismNewAccommodationFormImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		TourismNewAccommodationFormModelImpl
			tourismNewAccommodationFormModelImpl) {

		Object[] args = new Object[] {
			tourismNewAccommodationFormModelImpl.getTourismApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetTourismById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetTourismById, args,
			tourismNewAccommodationFormModelImpl);
	}

	/**
	 * Creates a new tourism new accommodation form with the primary key. Does not add the tourism new accommodation form to the database.
	 *
	 * @param tourismNewAccoFormId the primary key for the new tourism new accommodation form
	 * @return the new tourism new accommodation form
	 */
	@Override
	public TourismNewAccommodationForm create(long tourismNewAccoFormId) {
		TourismNewAccommodationForm tourismNewAccommodationForm =
			new TourismNewAccommodationFormImpl();

		tourismNewAccommodationForm.setNew(true);
		tourismNewAccommodationForm.setPrimaryKey(tourismNewAccoFormId);

		tourismNewAccommodationForm.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return tourismNewAccommodationForm;
	}

	/**
	 * Removes the tourism new accommodation form with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismNewAccoFormId the primary key of the tourism new accommodation form
	 * @return the tourism new accommodation form that was removed
	 * @throws NoSuchTourismNewAccommodationFormException if a tourism new accommodation form with the primary key could not be found
	 */
	@Override
	public TourismNewAccommodationForm remove(long tourismNewAccoFormId)
		throws NoSuchTourismNewAccommodationFormException {

		return remove((Serializable)tourismNewAccoFormId);
	}

	/**
	 * Removes the tourism new accommodation form with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tourism new accommodation form
	 * @return the tourism new accommodation form that was removed
	 * @throws NoSuchTourismNewAccommodationFormException if a tourism new accommodation form with the primary key could not be found
	 */
	@Override
	public TourismNewAccommodationForm remove(Serializable primaryKey)
		throws NoSuchTourismNewAccommodationFormException {

		Session session = null;

		try {
			session = openSession();

			TourismNewAccommodationForm tourismNewAccommodationForm =
				(TourismNewAccommodationForm)session.get(
					TourismNewAccommodationFormImpl.class, primaryKey);

			if (tourismNewAccommodationForm == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTourismNewAccommodationFormException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(tourismNewAccommodationForm);
		}
		catch (NoSuchTourismNewAccommodationFormException
					noSuchEntityException) {

			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected TourismNewAccommodationForm removeImpl(
		TourismNewAccommodationForm tourismNewAccommodationForm) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tourismNewAccommodationForm)) {
				tourismNewAccommodationForm =
					(TourismNewAccommodationForm)session.get(
						TourismNewAccommodationFormImpl.class,
						tourismNewAccommodationForm.getPrimaryKeyObj());
			}

			if (tourismNewAccommodationForm != null) {
				session.delete(tourismNewAccommodationForm);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (tourismNewAccommodationForm != null) {
			clearCache(tourismNewAccommodationForm);
		}

		return tourismNewAccommodationForm;
	}

	@Override
	public TourismNewAccommodationForm updateImpl(
		TourismNewAccommodationForm tourismNewAccommodationForm) {

		boolean isNew = tourismNewAccommodationForm.isNew();

		if (!(tourismNewAccommodationForm instanceof
				TourismNewAccommodationFormModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					tourismNewAccommodationForm.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					tourismNewAccommodationForm);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in tourismNewAccommodationForm proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom TourismNewAccommodationForm implementation " +
					tourismNewAccommodationForm.getClass());
		}

		TourismNewAccommodationFormModelImpl
			tourismNewAccommodationFormModelImpl =
				(TourismNewAccommodationFormModelImpl)
					tourismNewAccommodationForm;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (tourismNewAccommodationForm.getCreateDate() == null)) {
			if (serviceContext == null) {
				tourismNewAccommodationForm.setCreateDate(date);
			}
			else {
				tourismNewAccommodationForm.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!tourismNewAccommodationFormModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				tourismNewAccommodationForm.setModifiedDate(date);
			}
			else {
				tourismNewAccommodationForm.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(tourismNewAccommodationForm);
			}
			else {
				tourismNewAccommodationForm =
					(TourismNewAccommodationForm)session.merge(
						tourismNewAccommodationForm);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			TourismNewAccommodationFormImpl.class,
			tourismNewAccommodationFormModelImpl, false, true);

		cacheUniqueFindersCache(tourismNewAccommodationFormModelImpl);

		if (isNew) {
			tourismNewAccommodationForm.setNew(false);
		}

		tourismNewAccommodationForm.resetOriginalValues();

		return tourismNewAccommodationForm;
	}

	/**
	 * Returns the tourism new accommodation form with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tourism new accommodation form
	 * @return the tourism new accommodation form
	 * @throws NoSuchTourismNewAccommodationFormException if a tourism new accommodation form with the primary key could not be found
	 */
	@Override
	public TourismNewAccommodationForm findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTourismNewAccommodationFormException {

		TourismNewAccommodationForm tourismNewAccommodationForm =
			fetchByPrimaryKey(primaryKey);

		if (tourismNewAccommodationForm == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTourismNewAccommodationFormException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return tourismNewAccommodationForm;
	}

	/**
	 * Returns the tourism new accommodation form with the primary key or throws a <code>NoSuchTourismNewAccommodationFormException</code> if it could not be found.
	 *
	 * @param tourismNewAccoFormId the primary key of the tourism new accommodation form
	 * @return the tourism new accommodation form
	 * @throws NoSuchTourismNewAccommodationFormException if a tourism new accommodation form with the primary key could not be found
	 */
	@Override
	public TourismNewAccommodationForm findByPrimaryKey(
			long tourismNewAccoFormId)
		throws NoSuchTourismNewAccommodationFormException {

		return findByPrimaryKey((Serializable)tourismNewAccoFormId);
	}

	/**
	 * Returns the tourism new accommodation form with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismNewAccoFormId the primary key of the tourism new accommodation form
	 * @return the tourism new accommodation form, or <code>null</code> if a tourism new accommodation form with the primary key could not be found
	 */
	@Override
	public TourismNewAccommodationForm fetchByPrimaryKey(
		long tourismNewAccoFormId) {

		return fetchByPrimaryKey((Serializable)tourismNewAccoFormId);
	}

	/**
	 * Returns all the tourism new accommodation forms.
	 *
	 * @return the tourism new accommodation forms
	 */
	@Override
	public List<TourismNewAccommodationForm> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tourism new accommodation forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAccommodationFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new accommodation forms
	 * @param end the upper bound of the range of tourism new accommodation forms (not inclusive)
	 * @return the range of tourism new accommodation forms
	 */
	@Override
	public List<TourismNewAccommodationForm> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tourism new accommodation forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAccommodationFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new accommodation forms
	 * @param end the upper bound of the range of tourism new accommodation forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism new accommodation forms
	 */
	@Override
	public List<TourismNewAccommodationForm> findAll(
		int start, int end,
		OrderByComparator<TourismNewAccommodationForm> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the tourism new accommodation forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAccommodationFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new accommodation forms
	 * @param end the upper bound of the range of tourism new accommodation forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism new accommodation forms
	 */
	@Override
	public List<TourismNewAccommodationForm> findAll(
		int start, int end,
		OrderByComparator<TourismNewAccommodationForm> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<TourismNewAccommodationForm> list = null;

		if (useFinderCache) {
			list = (List<TourismNewAccommodationForm>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_TOURISMNEWACCOMMODATIONFORM);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_TOURISMNEWACCOMMODATIONFORM;

				sql = sql.concat(
					TourismNewAccommodationFormModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<TourismNewAccommodationForm>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the tourism new accommodation forms from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (TourismNewAccommodationForm tourismNewAccommodationForm :
				findAll()) {

			remove(tourismNewAccommodationForm);
		}
	}

	/**
	 * Returns the number of tourism new accommodation forms.
	 *
	 * @return the number of tourism new accommodation forms
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(
					_SQL_COUNT_TOURISMNEWACCOMMODATIONFORM);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "tourismNewAccoFormId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_TOURISMNEWACCOMMODATIONFORM;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return TourismNewAccommodationFormModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the tourism new accommodation form persistence.
	 */
	@Activate
	public void activate() {
		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathFetchBygetTourismById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetTourismById",
			new String[] {Long.class.getName()},
			new String[] {"tourismApplicationId"}, true);

		_finderPathCountBygetTourismById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetTourismById",
			new String[] {Long.class.getName()},
			new String[] {"tourismApplicationId"}, false);

		TourismNewAccommodationFormUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		TourismNewAccommodationFormUtil.setPersistence(null);

		entityCache.removeCache(
			TourismNewAccommodationFormImpl.class.getName());
	}

	@Override
	@Reference(
		target = TOURISMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = TOURISMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = TOURISMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_TOURISMNEWACCOMMODATIONFORM =
		"SELECT tourismNewAccommodationForm FROM TourismNewAccommodationForm tourismNewAccommodationForm";

	private static final String _SQL_SELECT_TOURISMNEWACCOMMODATIONFORM_WHERE =
		"SELECT tourismNewAccommodationForm FROM TourismNewAccommodationForm tourismNewAccommodationForm WHERE ";

	private static final String _SQL_COUNT_TOURISMNEWACCOMMODATIONFORM =
		"SELECT COUNT(tourismNewAccommodationForm) FROM TourismNewAccommodationForm tourismNewAccommodationForm";

	private static final String _SQL_COUNT_TOURISMNEWACCOMMODATIONFORM_WHERE =
		"SELECT COUNT(tourismNewAccommodationForm) FROM TourismNewAccommodationForm tourismNewAccommodationForm WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"tourismNewAccommodationForm.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No TourismNewAccommodationForm exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No TourismNewAccommodationForm exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		TourismNewAccommodationFormPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}