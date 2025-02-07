/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service.persistence.impl;

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

import com.nbp.jtb.application.form.service.exception.NoSuchAttractionDomesticTourException;
import com.nbp.jtb.application.form.service.model.AttractionDomesticTour;
import com.nbp.jtb.application.form.service.model.AttractionDomesticTourTable;
import com.nbp.jtb.application.form.service.model.impl.AttractionDomesticTourImpl;
import com.nbp.jtb.application.form.service.model.impl.AttractionDomesticTourModelImpl;
import com.nbp.jtb.application.form.service.service.persistence.AttractionDomesticTourPersistence;
import com.nbp.jtb.application.form.service.service.persistence.AttractionDomesticTourUtil;
import com.nbp.jtb.application.form.service.service.persistence.impl.constants.JTB_APPLICATION_FORMPersistenceConstants;

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
 * The persistence implementation for the attraction domestic tour service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AttractionDomesticTourPersistence.class)
public class AttractionDomesticTourPersistenceImpl
	extends BasePersistenceImpl<AttractionDomesticTour>
	implements AttractionDomesticTourPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AttractionDomesticTourUtil</code> to access the attraction domestic tour persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AttractionDomesticTourImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetJTB_ByApplicationId;
	private FinderPath _finderPathCountBygetJTB_ByApplicationId;

	/**
	 * Returns the attraction domestic tour where jtbApplicationId = &#63; or throws a <code>NoSuchAttractionDomesticTourException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction domestic tour
	 * @throws NoSuchAttractionDomesticTourException if a matching attraction domestic tour could not be found
	 */
	@Override
	public AttractionDomesticTour findBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAttractionDomesticTourException {

		AttractionDomesticTour attractionDomesticTour =
			fetchBygetJTB_ByApplicationId(jtbApplicationId);

		if (attractionDomesticTour == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("jtbApplicationId=");
			sb.append(jtbApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAttractionDomesticTourException(sb.toString());
		}

		return attractionDomesticTour;
	}

	/**
	 * Returns the attraction domestic tour where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction domestic tour, or <code>null</code> if a matching attraction domestic tour could not be found
	 */
	@Override
	public AttractionDomesticTour fetchBygetJTB_ByApplicationId(
		long jtbApplicationId) {

		return fetchBygetJTB_ByApplicationId(jtbApplicationId, true);
	}

	/**
	 * Returns the attraction domestic tour where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching attraction domestic tour, or <code>null</code> if a matching attraction domestic tour could not be found
	 */
	@Override
	public AttractionDomesticTour fetchBygetJTB_ByApplicationId(
		long jtbApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {jtbApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetJTB_ByApplicationId, finderArgs, this);
		}

		if (result instanceof AttractionDomesticTour) {
			AttractionDomesticTour attractionDomesticTour =
				(AttractionDomesticTour)result;

			if (jtbApplicationId !=
					attractionDomesticTour.getJtbApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_ATTRACTIONDOMESTICTOUR_WHERE);

			sb.append(_FINDER_COLUMN_GETJTB_BYAPPLICATIONID_JTBAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(jtbApplicationId);

				List<AttractionDomesticTour> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetJTB_ByApplicationId,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {jtbApplicationId};
							}

							_log.warn(
								"AttractionDomesticTourPersistenceImpl.fetchBygetJTB_ByApplicationId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AttractionDomesticTour attractionDomesticTour = list.get(0);

					result = attractionDomesticTour;

					cacheResult(attractionDomesticTour);
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
			return (AttractionDomesticTour)result;
		}
	}

	/**
	 * Removes the attraction domestic tour where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the attraction domestic tour that was removed
	 */
	@Override
	public AttractionDomesticTour removeBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAttractionDomesticTourException {

		AttractionDomesticTour attractionDomesticTour =
			findBygetJTB_ByApplicationId(jtbApplicationId);

		return remove(attractionDomesticTour);
	}

	/**
	 * Returns the number of attraction domestic tours where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching attraction domestic tours
	 */
	@Override
	public int countBygetJTB_ByApplicationId(long jtbApplicationId) {
		FinderPath finderPath = _finderPathCountBygetJTB_ByApplicationId;

		Object[] finderArgs = new Object[] {jtbApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ATTRACTIONDOMESTICTOUR_WHERE);

			sb.append(_FINDER_COLUMN_GETJTB_BYAPPLICATIONID_JTBAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(jtbApplicationId);

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
		_FINDER_COLUMN_GETJTB_BYAPPLICATIONID_JTBAPPLICATIONID_2 =
			"attractionDomesticTour.jtbApplicationId = ?";

	public AttractionDomesticTourPersistenceImpl() {
		setModelClass(AttractionDomesticTour.class);

		setModelImplClass(AttractionDomesticTourImpl.class);
		setModelPKClass(long.class);

		setTable(AttractionDomesticTourTable.INSTANCE);
	}

	/**
	 * Caches the attraction domestic tour in the entity cache if it is enabled.
	 *
	 * @param attractionDomesticTour the attraction domestic tour
	 */
	@Override
	public void cacheResult(AttractionDomesticTour attractionDomesticTour) {
		entityCache.putResult(
			AttractionDomesticTourImpl.class,
			attractionDomesticTour.getPrimaryKey(), attractionDomesticTour);

		finderCache.putResult(
			_finderPathFetchBygetJTB_ByApplicationId,
			new Object[] {attractionDomesticTour.getJtbApplicationId()},
			attractionDomesticTour);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the attraction domestic tours in the entity cache if it is enabled.
	 *
	 * @param attractionDomesticTours the attraction domestic tours
	 */
	@Override
	public void cacheResult(
		List<AttractionDomesticTour> attractionDomesticTours) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (attractionDomesticTours.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AttractionDomesticTour attractionDomesticTour :
				attractionDomesticTours) {

			if (entityCache.getResult(
					AttractionDomesticTourImpl.class,
					attractionDomesticTour.getPrimaryKey()) == null) {

				cacheResult(attractionDomesticTour);
			}
		}
	}

	/**
	 * Clears the cache for all attraction domestic tours.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AttractionDomesticTourImpl.class);

		finderCache.clearCache(AttractionDomesticTourImpl.class);
	}

	/**
	 * Clears the cache for the attraction domestic tour.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AttractionDomesticTour attractionDomesticTour) {
		entityCache.removeResult(
			AttractionDomesticTourImpl.class, attractionDomesticTour);
	}

	@Override
	public void clearCache(
		List<AttractionDomesticTour> attractionDomesticTours) {

		for (AttractionDomesticTour attractionDomesticTour :
				attractionDomesticTours) {

			entityCache.removeResult(
				AttractionDomesticTourImpl.class, attractionDomesticTour);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AttractionDomesticTourImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				AttractionDomesticTourImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		AttractionDomesticTourModelImpl attractionDomesticTourModelImpl) {

		Object[] args = new Object[] {
			attractionDomesticTourModelImpl.getJtbApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetJTB_ByApplicationId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetJTB_ByApplicationId, args,
			attractionDomesticTourModelImpl);
	}

	/**
	 * Creates a new attraction domestic tour with the primary key. Does not add the attraction domestic tour to the database.
	 *
	 * @param attractionDomesticTourId the primary key for the new attraction domestic tour
	 * @return the new attraction domestic tour
	 */
	@Override
	public AttractionDomesticTour create(long attractionDomesticTourId) {
		AttractionDomesticTour attractionDomesticTour =
			new AttractionDomesticTourImpl();

		attractionDomesticTour.setNew(true);
		attractionDomesticTour.setPrimaryKey(attractionDomesticTourId);

		attractionDomesticTour.setCompanyId(CompanyThreadLocal.getCompanyId());

		return attractionDomesticTour;
	}

	/**
	 * Removes the attraction domestic tour with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param attractionDomesticTourId the primary key of the attraction domestic tour
	 * @return the attraction domestic tour that was removed
	 * @throws NoSuchAttractionDomesticTourException if a attraction domestic tour with the primary key could not be found
	 */
	@Override
	public AttractionDomesticTour remove(long attractionDomesticTourId)
		throws NoSuchAttractionDomesticTourException {

		return remove((Serializable)attractionDomesticTourId);
	}

	/**
	 * Removes the attraction domestic tour with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the attraction domestic tour
	 * @return the attraction domestic tour that was removed
	 * @throws NoSuchAttractionDomesticTourException if a attraction domestic tour with the primary key could not be found
	 */
	@Override
	public AttractionDomesticTour remove(Serializable primaryKey)
		throws NoSuchAttractionDomesticTourException {

		Session session = null;

		try {
			session = openSession();

			AttractionDomesticTour attractionDomesticTour =
				(AttractionDomesticTour)session.get(
					AttractionDomesticTourImpl.class, primaryKey);

			if (attractionDomesticTour == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAttractionDomesticTourException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(attractionDomesticTour);
		}
		catch (NoSuchAttractionDomesticTourException noSuchEntityException) {
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
	protected AttractionDomesticTour removeImpl(
		AttractionDomesticTour attractionDomesticTour) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(attractionDomesticTour)) {
				attractionDomesticTour = (AttractionDomesticTour)session.get(
					AttractionDomesticTourImpl.class,
					attractionDomesticTour.getPrimaryKeyObj());
			}

			if (attractionDomesticTour != null) {
				session.delete(attractionDomesticTour);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (attractionDomesticTour != null) {
			clearCache(attractionDomesticTour);
		}

		return attractionDomesticTour;
	}

	@Override
	public AttractionDomesticTour updateImpl(
		AttractionDomesticTour attractionDomesticTour) {

		boolean isNew = attractionDomesticTour.isNew();

		if (!(attractionDomesticTour instanceof
				AttractionDomesticTourModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(attractionDomesticTour.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					attractionDomesticTour);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in attractionDomesticTour proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AttractionDomesticTour implementation " +
					attractionDomesticTour.getClass());
		}

		AttractionDomesticTourModelImpl attractionDomesticTourModelImpl =
			(AttractionDomesticTourModelImpl)attractionDomesticTour;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (attractionDomesticTour.getCreateDate() == null)) {
			if (serviceContext == null) {
				attractionDomesticTour.setCreateDate(date);
			}
			else {
				attractionDomesticTour.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!attractionDomesticTourModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				attractionDomesticTour.setModifiedDate(date);
			}
			else {
				attractionDomesticTour.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(attractionDomesticTour);
			}
			else {
				attractionDomesticTour = (AttractionDomesticTour)session.merge(
					attractionDomesticTour);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AttractionDomesticTourImpl.class, attractionDomesticTourModelImpl,
			false, true);

		cacheUniqueFindersCache(attractionDomesticTourModelImpl);

		if (isNew) {
			attractionDomesticTour.setNew(false);
		}

		attractionDomesticTour.resetOriginalValues();

		return attractionDomesticTour;
	}

	/**
	 * Returns the attraction domestic tour with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the attraction domestic tour
	 * @return the attraction domestic tour
	 * @throws NoSuchAttractionDomesticTourException if a attraction domestic tour with the primary key could not be found
	 */
	@Override
	public AttractionDomesticTour findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAttractionDomesticTourException {

		AttractionDomesticTour attractionDomesticTour = fetchByPrimaryKey(
			primaryKey);

		if (attractionDomesticTour == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAttractionDomesticTourException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return attractionDomesticTour;
	}

	/**
	 * Returns the attraction domestic tour with the primary key or throws a <code>NoSuchAttractionDomesticTourException</code> if it could not be found.
	 *
	 * @param attractionDomesticTourId the primary key of the attraction domestic tour
	 * @return the attraction domestic tour
	 * @throws NoSuchAttractionDomesticTourException if a attraction domestic tour with the primary key could not be found
	 */
	@Override
	public AttractionDomesticTour findByPrimaryKey(
			long attractionDomesticTourId)
		throws NoSuchAttractionDomesticTourException {

		return findByPrimaryKey((Serializable)attractionDomesticTourId);
	}

	/**
	 * Returns the attraction domestic tour with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param attractionDomesticTourId the primary key of the attraction domestic tour
	 * @return the attraction domestic tour, or <code>null</code> if a attraction domestic tour with the primary key could not be found
	 */
	@Override
	public AttractionDomesticTour fetchByPrimaryKey(
		long attractionDomesticTourId) {

		return fetchByPrimaryKey((Serializable)attractionDomesticTourId);
	}

	/**
	 * Returns all the attraction domestic tours.
	 *
	 * @return the attraction domestic tours
	 */
	@Override
	public List<AttractionDomesticTour> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the attraction domestic tours.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionDomesticTourModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction domestic tours
	 * @param end the upper bound of the range of attraction domestic tours (not inclusive)
	 * @return the range of attraction domestic tours
	 */
	@Override
	public List<AttractionDomesticTour> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the attraction domestic tours.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionDomesticTourModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction domestic tours
	 * @param end the upper bound of the range of attraction domestic tours (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of attraction domestic tours
	 */
	@Override
	public List<AttractionDomesticTour> findAll(
		int start, int end,
		OrderByComparator<AttractionDomesticTour> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the attraction domestic tours.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionDomesticTourModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction domestic tours
	 * @param end the upper bound of the range of attraction domestic tours (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of attraction domestic tours
	 */
	@Override
	public List<AttractionDomesticTour> findAll(
		int start, int end,
		OrderByComparator<AttractionDomesticTour> orderByComparator,
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

		List<AttractionDomesticTour> list = null;

		if (useFinderCache) {
			list = (List<AttractionDomesticTour>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ATTRACTIONDOMESTICTOUR);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ATTRACTIONDOMESTICTOUR;

				sql = sql.concat(AttractionDomesticTourModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AttractionDomesticTour>)QueryUtil.list(
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
	 * Removes all the attraction domestic tours from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AttractionDomesticTour attractionDomesticTour : findAll()) {
			remove(attractionDomesticTour);
		}
	}

	/**
	 * Returns the number of attraction domestic tours.
	 *
	 * @return the number of attraction domestic tours
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
					_SQL_COUNT_ATTRACTIONDOMESTICTOUR);

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
		return "attractionDomesticTourId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ATTRACTIONDOMESTICTOUR;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AttractionDomesticTourModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the attraction domestic tour persistence.
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

		_finderPathFetchBygetJTB_ByApplicationId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetJTB_ByApplicationId",
			new String[] {Long.class.getName()},
			new String[] {"jtbApplicationId"}, true);

		_finderPathCountBygetJTB_ByApplicationId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetJTB_ByApplicationId",
			new String[] {Long.class.getName()},
			new String[] {"jtbApplicationId"}, false);

		AttractionDomesticTourUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AttractionDomesticTourUtil.setPersistence(null);

		entityCache.removeCache(AttractionDomesticTourImpl.class.getName());
	}

	@Override
	@Reference(
		target = JTB_APPLICATION_FORMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = JTB_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = JTB_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_ATTRACTIONDOMESTICTOUR =
		"SELECT attractionDomesticTour FROM AttractionDomesticTour attractionDomesticTour";

	private static final String _SQL_SELECT_ATTRACTIONDOMESTICTOUR_WHERE =
		"SELECT attractionDomesticTour FROM AttractionDomesticTour attractionDomesticTour WHERE ";

	private static final String _SQL_COUNT_ATTRACTIONDOMESTICTOUR =
		"SELECT COUNT(attractionDomesticTour) FROM AttractionDomesticTour attractionDomesticTour";

	private static final String _SQL_COUNT_ATTRACTIONDOMESTICTOUR_WHERE =
		"SELECT COUNT(attractionDomesticTour) FROM AttractionDomesticTour attractionDomesticTour WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"attractionDomesticTour.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AttractionDomesticTour exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AttractionDomesticTour exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AttractionDomesticTourPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}