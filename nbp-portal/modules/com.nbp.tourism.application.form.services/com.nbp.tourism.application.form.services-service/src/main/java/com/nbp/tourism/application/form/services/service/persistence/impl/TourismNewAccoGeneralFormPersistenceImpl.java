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

import com.nbp.tourism.application.form.services.exception.NoSuchTourismNewAccoGeneralFormException;
import com.nbp.tourism.application.form.services.model.TourismNewAccoGeneralForm;
import com.nbp.tourism.application.form.services.model.TourismNewAccoGeneralFormTable;
import com.nbp.tourism.application.form.services.model.impl.TourismNewAccoGeneralFormImpl;
import com.nbp.tourism.application.form.services.model.impl.TourismNewAccoGeneralFormModelImpl;
import com.nbp.tourism.application.form.services.service.persistence.TourismNewAccoGeneralFormPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismNewAccoGeneralFormUtil;
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
 * The persistence implementation for the tourism new acco general form service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = TourismNewAccoGeneralFormPersistence.class)
public class TourismNewAccoGeneralFormPersistenceImpl
	extends BasePersistenceImpl<TourismNewAccoGeneralForm>
	implements TourismNewAccoGeneralFormPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>TourismNewAccoGeneralFormUtil</code> to access the tourism new acco general form persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		TourismNewAccoGeneralFormImpl.class.getName();

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
	 * Returns the tourism new acco general form where tourismApplicationId = &#63; or throws a <code>NoSuchTourismNewAccoGeneralFormException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new acco general form
	 * @throws NoSuchTourismNewAccoGeneralFormException if a matching tourism new acco general form could not be found
	 */
	@Override
	public TourismNewAccoGeneralForm findBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismNewAccoGeneralFormException {

		TourismNewAccoGeneralForm tourismNewAccoGeneralForm =
			fetchBygetTourismById(tourismApplicationId);

		if (tourismNewAccoGeneralForm == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("tourismApplicationId=");
			sb.append(tourismApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchTourismNewAccoGeneralFormException(sb.toString());
		}

		return tourismNewAccoGeneralForm;
	}

	/**
	 * Returns the tourism new acco general form where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new acco general form, or <code>null</code> if a matching tourism new acco general form could not be found
	 */
	@Override
	public TourismNewAccoGeneralForm fetchBygetTourismById(
		long tourismApplicationId) {

		return fetchBygetTourismById(tourismApplicationId, true);
	}

	/**
	 * Returns the tourism new acco general form where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism new acco general form, or <code>null</code> if a matching tourism new acco general form could not be found
	 */
	@Override
	public TourismNewAccoGeneralForm fetchBygetTourismById(
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

		if (result instanceof TourismNewAccoGeneralForm) {
			TourismNewAccoGeneralForm tourismNewAccoGeneralForm =
				(TourismNewAccoGeneralForm)result;

			if (tourismApplicationId !=
					tourismNewAccoGeneralForm.getTourismApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_TOURISMNEWACCOGENERALFORM_WHERE);

			sb.append(_FINDER_COLUMN_GETTOURISMBYID_TOURISMAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(tourismApplicationId);

				List<TourismNewAccoGeneralForm> list = query.list();

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
								"TourismNewAccoGeneralFormPersistenceImpl.fetchBygetTourismById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					TourismNewAccoGeneralForm tourismNewAccoGeneralForm =
						list.get(0);

					result = tourismNewAccoGeneralForm;

					cacheResult(tourismNewAccoGeneralForm);
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
			return (TourismNewAccoGeneralForm)result;
		}
	}

	/**
	 * Removes the tourism new acco general form where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism new acco general form that was removed
	 */
	@Override
	public TourismNewAccoGeneralForm removeBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismNewAccoGeneralFormException {

		TourismNewAccoGeneralForm tourismNewAccoGeneralForm =
			findBygetTourismById(tourismApplicationId);

		return remove(tourismNewAccoGeneralForm);
	}

	/**
	 * Returns the number of tourism new acco general forms where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism new acco general forms
	 */
	@Override
	public int countBygetTourismById(long tourismApplicationId) {
		FinderPath finderPath = _finderPathCountBygetTourismById;

		Object[] finderArgs = new Object[] {tourismApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_TOURISMNEWACCOGENERALFORM_WHERE);

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
			"tourismNewAccoGeneralForm.tourismApplicationId = ?";

	public TourismNewAccoGeneralFormPersistenceImpl() {
		setModelClass(TourismNewAccoGeneralForm.class);

		setModelImplClass(TourismNewAccoGeneralFormImpl.class);
		setModelPKClass(long.class);

		setTable(TourismNewAccoGeneralFormTable.INSTANCE);
	}

	/**
	 * Caches the tourism new acco general form in the entity cache if it is enabled.
	 *
	 * @param tourismNewAccoGeneralForm the tourism new acco general form
	 */
	@Override
	public void cacheResult(
		TourismNewAccoGeneralForm tourismNewAccoGeneralForm) {

		entityCache.putResult(
			TourismNewAccoGeneralFormImpl.class,
			tourismNewAccoGeneralForm.getPrimaryKey(),
			tourismNewAccoGeneralForm);

		finderCache.putResult(
			_finderPathFetchBygetTourismById,
			new Object[] {tourismNewAccoGeneralForm.getTourismApplicationId()},
			tourismNewAccoGeneralForm);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the tourism new acco general forms in the entity cache if it is enabled.
	 *
	 * @param tourismNewAccoGeneralForms the tourism new acco general forms
	 */
	@Override
	public void cacheResult(
		List<TourismNewAccoGeneralForm> tourismNewAccoGeneralForms) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (tourismNewAccoGeneralForms.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (TourismNewAccoGeneralForm tourismNewAccoGeneralForm :
				tourismNewAccoGeneralForms) {

			if (entityCache.getResult(
					TourismNewAccoGeneralFormImpl.class,
					tourismNewAccoGeneralForm.getPrimaryKey()) == null) {

				cacheResult(tourismNewAccoGeneralForm);
			}
		}
	}

	/**
	 * Clears the cache for all tourism new acco general forms.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(TourismNewAccoGeneralFormImpl.class);

		finderCache.clearCache(TourismNewAccoGeneralFormImpl.class);
	}

	/**
	 * Clears the cache for the tourism new acco general form.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		TourismNewAccoGeneralForm tourismNewAccoGeneralForm) {

		entityCache.removeResult(
			TourismNewAccoGeneralFormImpl.class, tourismNewAccoGeneralForm);
	}

	@Override
	public void clearCache(
		List<TourismNewAccoGeneralForm> tourismNewAccoGeneralForms) {

		for (TourismNewAccoGeneralForm tourismNewAccoGeneralForm :
				tourismNewAccoGeneralForms) {

			entityCache.removeResult(
				TourismNewAccoGeneralFormImpl.class, tourismNewAccoGeneralForm);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(TourismNewAccoGeneralFormImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				TourismNewAccoGeneralFormImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		TourismNewAccoGeneralFormModelImpl tourismNewAccoGeneralFormModelImpl) {

		Object[] args = new Object[] {
			tourismNewAccoGeneralFormModelImpl.getTourismApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetTourismById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetTourismById, args,
			tourismNewAccoGeneralFormModelImpl);
	}

	/**
	 * Creates a new tourism new acco general form with the primary key. Does not add the tourism new acco general form to the database.
	 *
	 * @param tourismNewAccoGenFormId the primary key for the new tourism new acco general form
	 * @return the new tourism new acco general form
	 */
	@Override
	public TourismNewAccoGeneralForm create(long tourismNewAccoGenFormId) {
		TourismNewAccoGeneralForm tourismNewAccoGeneralForm =
			new TourismNewAccoGeneralFormImpl();

		tourismNewAccoGeneralForm.setNew(true);
		tourismNewAccoGeneralForm.setPrimaryKey(tourismNewAccoGenFormId);

		tourismNewAccoGeneralForm.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return tourismNewAccoGeneralForm;
	}

	/**
	 * Removes the tourism new acco general form with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismNewAccoGenFormId the primary key of the tourism new acco general form
	 * @return the tourism new acco general form that was removed
	 * @throws NoSuchTourismNewAccoGeneralFormException if a tourism new acco general form with the primary key could not be found
	 */
	@Override
	public TourismNewAccoGeneralForm remove(long tourismNewAccoGenFormId)
		throws NoSuchTourismNewAccoGeneralFormException {

		return remove((Serializable)tourismNewAccoGenFormId);
	}

	/**
	 * Removes the tourism new acco general form with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tourism new acco general form
	 * @return the tourism new acco general form that was removed
	 * @throws NoSuchTourismNewAccoGeneralFormException if a tourism new acco general form with the primary key could not be found
	 */
	@Override
	public TourismNewAccoGeneralForm remove(Serializable primaryKey)
		throws NoSuchTourismNewAccoGeneralFormException {

		Session session = null;

		try {
			session = openSession();

			TourismNewAccoGeneralForm tourismNewAccoGeneralForm =
				(TourismNewAccoGeneralForm)session.get(
					TourismNewAccoGeneralFormImpl.class, primaryKey);

			if (tourismNewAccoGeneralForm == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTourismNewAccoGeneralFormException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(tourismNewAccoGeneralForm);
		}
		catch (NoSuchTourismNewAccoGeneralFormException noSuchEntityException) {
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
	protected TourismNewAccoGeneralForm removeImpl(
		TourismNewAccoGeneralForm tourismNewAccoGeneralForm) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tourismNewAccoGeneralForm)) {
				tourismNewAccoGeneralForm =
					(TourismNewAccoGeneralForm)session.get(
						TourismNewAccoGeneralFormImpl.class,
						tourismNewAccoGeneralForm.getPrimaryKeyObj());
			}

			if (tourismNewAccoGeneralForm != null) {
				session.delete(tourismNewAccoGeneralForm);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (tourismNewAccoGeneralForm != null) {
			clearCache(tourismNewAccoGeneralForm);
		}

		return tourismNewAccoGeneralForm;
	}

	@Override
	public TourismNewAccoGeneralForm updateImpl(
		TourismNewAccoGeneralForm tourismNewAccoGeneralForm) {

		boolean isNew = tourismNewAccoGeneralForm.isNew();

		if (!(tourismNewAccoGeneralForm instanceof
				TourismNewAccoGeneralFormModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(tourismNewAccoGeneralForm.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					tourismNewAccoGeneralForm);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in tourismNewAccoGeneralForm proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom TourismNewAccoGeneralForm implementation " +
					tourismNewAccoGeneralForm.getClass());
		}

		TourismNewAccoGeneralFormModelImpl tourismNewAccoGeneralFormModelImpl =
			(TourismNewAccoGeneralFormModelImpl)tourismNewAccoGeneralForm;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (tourismNewAccoGeneralForm.getCreateDate() == null)) {
			if (serviceContext == null) {
				tourismNewAccoGeneralForm.setCreateDate(date);
			}
			else {
				tourismNewAccoGeneralForm.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!tourismNewAccoGeneralFormModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				tourismNewAccoGeneralForm.setModifiedDate(date);
			}
			else {
				tourismNewAccoGeneralForm.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(tourismNewAccoGeneralForm);
			}
			else {
				tourismNewAccoGeneralForm =
					(TourismNewAccoGeneralForm)session.merge(
						tourismNewAccoGeneralForm);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			TourismNewAccoGeneralFormImpl.class,
			tourismNewAccoGeneralFormModelImpl, false, true);

		cacheUniqueFindersCache(tourismNewAccoGeneralFormModelImpl);

		if (isNew) {
			tourismNewAccoGeneralForm.setNew(false);
		}

		tourismNewAccoGeneralForm.resetOriginalValues();

		return tourismNewAccoGeneralForm;
	}

	/**
	 * Returns the tourism new acco general form with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tourism new acco general form
	 * @return the tourism new acco general form
	 * @throws NoSuchTourismNewAccoGeneralFormException if a tourism new acco general form with the primary key could not be found
	 */
	@Override
	public TourismNewAccoGeneralForm findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTourismNewAccoGeneralFormException {

		TourismNewAccoGeneralForm tourismNewAccoGeneralForm = fetchByPrimaryKey(
			primaryKey);

		if (tourismNewAccoGeneralForm == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTourismNewAccoGeneralFormException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return tourismNewAccoGeneralForm;
	}

	/**
	 * Returns the tourism new acco general form with the primary key or throws a <code>NoSuchTourismNewAccoGeneralFormException</code> if it could not be found.
	 *
	 * @param tourismNewAccoGenFormId the primary key of the tourism new acco general form
	 * @return the tourism new acco general form
	 * @throws NoSuchTourismNewAccoGeneralFormException if a tourism new acco general form with the primary key could not be found
	 */
	@Override
	public TourismNewAccoGeneralForm findByPrimaryKey(
			long tourismNewAccoGenFormId)
		throws NoSuchTourismNewAccoGeneralFormException {

		return findByPrimaryKey((Serializable)tourismNewAccoGenFormId);
	}

	/**
	 * Returns the tourism new acco general form with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismNewAccoGenFormId the primary key of the tourism new acco general form
	 * @return the tourism new acco general form, or <code>null</code> if a tourism new acco general form with the primary key could not be found
	 */
	@Override
	public TourismNewAccoGeneralForm fetchByPrimaryKey(
		long tourismNewAccoGenFormId) {

		return fetchByPrimaryKey((Serializable)tourismNewAccoGenFormId);
	}

	/**
	 * Returns all the tourism new acco general forms.
	 *
	 * @return the tourism new acco general forms
	 */
	@Override
	public List<TourismNewAccoGeneralForm> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tourism new acco general forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAccoGeneralFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new acco general forms
	 * @param end the upper bound of the range of tourism new acco general forms (not inclusive)
	 * @return the range of tourism new acco general forms
	 */
	@Override
	public List<TourismNewAccoGeneralForm> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tourism new acco general forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAccoGeneralFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new acco general forms
	 * @param end the upper bound of the range of tourism new acco general forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism new acco general forms
	 */
	@Override
	public List<TourismNewAccoGeneralForm> findAll(
		int start, int end,
		OrderByComparator<TourismNewAccoGeneralForm> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the tourism new acco general forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAccoGeneralFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new acco general forms
	 * @param end the upper bound of the range of tourism new acco general forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism new acco general forms
	 */
	@Override
	public List<TourismNewAccoGeneralForm> findAll(
		int start, int end,
		OrderByComparator<TourismNewAccoGeneralForm> orderByComparator,
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

		List<TourismNewAccoGeneralForm> list = null;

		if (useFinderCache) {
			list = (List<TourismNewAccoGeneralForm>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_TOURISMNEWACCOGENERALFORM);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_TOURISMNEWACCOGENERALFORM;

				sql = sql.concat(
					TourismNewAccoGeneralFormModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<TourismNewAccoGeneralForm>)QueryUtil.list(
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
	 * Removes all the tourism new acco general forms from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (TourismNewAccoGeneralForm tourismNewAccoGeneralForm : findAll()) {
			remove(tourismNewAccoGeneralForm);
		}
	}

	/**
	 * Returns the number of tourism new acco general forms.
	 *
	 * @return the number of tourism new acco general forms
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
					_SQL_COUNT_TOURISMNEWACCOGENERALFORM);

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
		return "tourismNewAccoGenFormId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_TOURISMNEWACCOGENERALFORM;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return TourismNewAccoGeneralFormModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the tourism new acco general form persistence.
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

		TourismNewAccoGeneralFormUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		TourismNewAccoGeneralFormUtil.setPersistence(null);

		entityCache.removeCache(TourismNewAccoGeneralFormImpl.class.getName());
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

	private static final String _SQL_SELECT_TOURISMNEWACCOGENERALFORM =
		"SELECT tourismNewAccoGeneralForm FROM TourismNewAccoGeneralForm tourismNewAccoGeneralForm";

	private static final String _SQL_SELECT_TOURISMNEWACCOGENERALFORM_WHERE =
		"SELECT tourismNewAccoGeneralForm FROM TourismNewAccoGeneralForm tourismNewAccoGeneralForm WHERE ";

	private static final String _SQL_COUNT_TOURISMNEWACCOGENERALFORM =
		"SELECT COUNT(tourismNewAccoGeneralForm) FROM TourismNewAccoGeneralForm tourismNewAccoGeneralForm";

	private static final String _SQL_COUNT_TOURISMNEWACCOGENERALFORM_WHERE =
		"SELECT COUNT(tourismNewAccoGeneralForm) FROM TourismNewAccoGeneralForm tourismNewAccoGeneralForm WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"tourismNewAccoGeneralForm.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No TourismNewAccoGeneralForm exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No TourismNewAccoGeneralForm exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		TourismNewAccoGeneralFormPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}