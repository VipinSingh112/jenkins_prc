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

import com.nbp.jtb.application.form.service.exception.NoSuchAccoNonHotelRequiredLicException;
import com.nbp.jtb.application.form.service.model.AccoNonHotelRequiredLic;
import com.nbp.jtb.application.form.service.model.AccoNonHotelRequiredLicTable;
import com.nbp.jtb.application.form.service.model.impl.AccoNonHotelRequiredLicImpl;
import com.nbp.jtb.application.form.service.model.impl.AccoNonHotelRequiredLicModelImpl;
import com.nbp.jtb.application.form.service.service.persistence.AccoNonHotelRequiredLicPersistence;
import com.nbp.jtb.application.form.service.service.persistence.AccoNonHotelRequiredLicUtil;
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
 * The persistence implementation for the acco non hotel required lic service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AccoNonHotelRequiredLicPersistence.class)
public class AccoNonHotelRequiredLicPersistenceImpl
	extends BasePersistenceImpl<AccoNonHotelRequiredLic>
	implements AccoNonHotelRequiredLicPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AccoNonHotelRequiredLicUtil</code> to access the acco non hotel required lic persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AccoNonHotelRequiredLicImpl.class.getName();

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
	 * Returns the acco non hotel required lic where jtbApplicationId = &#63; or throws a <code>NoSuchAccoNonHotelRequiredLicException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching acco non hotel required lic
	 * @throws NoSuchAccoNonHotelRequiredLicException if a matching acco non hotel required lic could not be found
	 */
	@Override
	public AccoNonHotelRequiredLic findBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAccoNonHotelRequiredLicException {

		AccoNonHotelRequiredLic accoNonHotelRequiredLic =
			fetchBygetJTB_ByApplicationId(jtbApplicationId);

		if (accoNonHotelRequiredLic == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("jtbApplicationId=");
			sb.append(jtbApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAccoNonHotelRequiredLicException(sb.toString());
		}

		return accoNonHotelRequiredLic;
	}

	/**
	 * Returns the acco non hotel required lic where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching acco non hotel required lic, or <code>null</code> if a matching acco non hotel required lic could not be found
	 */
	@Override
	public AccoNonHotelRequiredLic fetchBygetJTB_ByApplicationId(
		long jtbApplicationId) {

		return fetchBygetJTB_ByApplicationId(jtbApplicationId, true);
	}

	/**
	 * Returns the acco non hotel required lic where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acco non hotel required lic, or <code>null</code> if a matching acco non hotel required lic could not be found
	 */
	@Override
	public AccoNonHotelRequiredLic fetchBygetJTB_ByApplicationId(
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

		if (result instanceof AccoNonHotelRequiredLic) {
			AccoNonHotelRequiredLic accoNonHotelRequiredLic =
				(AccoNonHotelRequiredLic)result;

			if (jtbApplicationId !=
					accoNonHotelRequiredLic.getJtbApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_ACCONONHOTELREQUIREDLIC_WHERE);

			sb.append(_FINDER_COLUMN_GETJTB_BYAPPLICATIONID_JTBAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(jtbApplicationId);

				List<AccoNonHotelRequiredLic> list = query.list();

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
								"AccoNonHotelRequiredLicPersistenceImpl.fetchBygetJTB_ByApplicationId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AccoNonHotelRequiredLic accoNonHotelRequiredLic = list.get(
						0);

					result = accoNonHotelRequiredLic;

					cacheResult(accoNonHotelRequiredLic);
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
			return (AccoNonHotelRequiredLic)result;
		}
	}

	/**
	 * Removes the acco non hotel required lic where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the acco non hotel required lic that was removed
	 */
	@Override
	public AccoNonHotelRequiredLic removeBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAccoNonHotelRequiredLicException {

		AccoNonHotelRequiredLic accoNonHotelRequiredLic =
			findBygetJTB_ByApplicationId(jtbApplicationId);

		return remove(accoNonHotelRequiredLic);
	}

	/**
	 * Returns the number of acco non hotel required lics where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching acco non hotel required lics
	 */
	@Override
	public int countBygetJTB_ByApplicationId(long jtbApplicationId) {
		FinderPath finderPath = _finderPathCountBygetJTB_ByApplicationId;

		Object[] finderArgs = new Object[] {jtbApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ACCONONHOTELREQUIREDLIC_WHERE);

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
			"accoNonHotelRequiredLic.jtbApplicationId = ?";

	public AccoNonHotelRequiredLicPersistenceImpl() {
		setModelClass(AccoNonHotelRequiredLic.class);

		setModelImplClass(AccoNonHotelRequiredLicImpl.class);
		setModelPKClass(long.class);

		setTable(AccoNonHotelRequiredLicTable.INSTANCE);
	}

	/**
	 * Caches the acco non hotel required lic in the entity cache if it is enabled.
	 *
	 * @param accoNonHotelRequiredLic the acco non hotel required lic
	 */
	@Override
	public void cacheResult(AccoNonHotelRequiredLic accoNonHotelRequiredLic) {
		entityCache.putResult(
			AccoNonHotelRequiredLicImpl.class,
			accoNonHotelRequiredLic.getPrimaryKey(), accoNonHotelRequiredLic);

		finderCache.putResult(
			_finderPathFetchBygetJTB_ByApplicationId,
			new Object[] {accoNonHotelRequiredLic.getJtbApplicationId()},
			accoNonHotelRequiredLic);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the acco non hotel required lics in the entity cache if it is enabled.
	 *
	 * @param accoNonHotelRequiredLics the acco non hotel required lics
	 */
	@Override
	public void cacheResult(
		List<AccoNonHotelRequiredLic> accoNonHotelRequiredLics) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (accoNonHotelRequiredLics.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AccoNonHotelRequiredLic accoNonHotelRequiredLic :
				accoNonHotelRequiredLics) {

			if (entityCache.getResult(
					AccoNonHotelRequiredLicImpl.class,
					accoNonHotelRequiredLic.getPrimaryKey()) == null) {

				cacheResult(accoNonHotelRequiredLic);
			}
		}
	}

	/**
	 * Clears the cache for all acco non hotel required lics.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AccoNonHotelRequiredLicImpl.class);

		finderCache.clearCache(AccoNonHotelRequiredLicImpl.class);
	}

	/**
	 * Clears the cache for the acco non hotel required lic.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AccoNonHotelRequiredLic accoNonHotelRequiredLic) {
		entityCache.removeResult(
			AccoNonHotelRequiredLicImpl.class, accoNonHotelRequiredLic);
	}

	@Override
	public void clearCache(
		List<AccoNonHotelRequiredLic> accoNonHotelRequiredLics) {

		for (AccoNonHotelRequiredLic accoNonHotelRequiredLic :
				accoNonHotelRequiredLics) {

			entityCache.removeResult(
				AccoNonHotelRequiredLicImpl.class, accoNonHotelRequiredLic);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AccoNonHotelRequiredLicImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				AccoNonHotelRequiredLicImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		AccoNonHotelRequiredLicModelImpl accoNonHotelRequiredLicModelImpl) {

		Object[] args = new Object[] {
			accoNonHotelRequiredLicModelImpl.getJtbApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetJTB_ByApplicationId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetJTB_ByApplicationId, args,
			accoNonHotelRequiredLicModelImpl);
	}

	/**
	 * Creates a new acco non hotel required lic with the primary key. Does not add the acco non hotel required lic to the database.
	 *
	 * @param accoNonHotelRequiredLicId the primary key for the new acco non hotel required lic
	 * @return the new acco non hotel required lic
	 */
	@Override
	public AccoNonHotelRequiredLic create(long accoNonHotelRequiredLicId) {
		AccoNonHotelRequiredLic accoNonHotelRequiredLic =
			new AccoNonHotelRequiredLicImpl();

		accoNonHotelRequiredLic.setNew(true);
		accoNonHotelRequiredLic.setPrimaryKey(accoNonHotelRequiredLicId);

		accoNonHotelRequiredLic.setCompanyId(CompanyThreadLocal.getCompanyId());

		return accoNonHotelRequiredLic;
	}

	/**
	 * Removes the acco non hotel required lic with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param accoNonHotelRequiredLicId the primary key of the acco non hotel required lic
	 * @return the acco non hotel required lic that was removed
	 * @throws NoSuchAccoNonHotelRequiredLicException if a acco non hotel required lic with the primary key could not be found
	 */
	@Override
	public AccoNonHotelRequiredLic remove(long accoNonHotelRequiredLicId)
		throws NoSuchAccoNonHotelRequiredLicException {

		return remove((Serializable)accoNonHotelRequiredLicId);
	}

	/**
	 * Removes the acco non hotel required lic with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the acco non hotel required lic
	 * @return the acco non hotel required lic that was removed
	 * @throws NoSuchAccoNonHotelRequiredLicException if a acco non hotel required lic with the primary key could not be found
	 */
	@Override
	public AccoNonHotelRequiredLic remove(Serializable primaryKey)
		throws NoSuchAccoNonHotelRequiredLicException {

		Session session = null;

		try {
			session = openSession();

			AccoNonHotelRequiredLic accoNonHotelRequiredLic =
				(AccoNonHotelRequiredLic)session.get(
					AccoNonHotelRequiredLicImpl.class, primaryKey);

			if (accoNonHotelRequiredLic == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAccoNonHotelRequiredLicException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(accoNonHotelRequiredLic);
		}
		catch (NoSuchAccoNonHotelRequiredLicException noSuchEntityException) {
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
	protected AccoNonHotelRequiredLic removeImpl(
		AccoNonHotelRequiredLic accoNonHotelRequiredLic) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(accoNonHotelRequiredLic)) {
				accoNonHotelRequiredLic = (AccoNonHotelRequiredLic)session.get(
					AccoNonHotelRequiredLicImpl.class,
					accoNonHotelRequiredLic.getPrimaryKeyObj());
			}

			if (accoNonHotelRequiredLic != null) {
				session.delete(accoNonHotelRequiredLic);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (accoNonHotelRequiredLic != null) {
			clearCache(accoNonHotelRequiredLic);
		}

		return accoNonHotelRequiredLic;
	}

	@Override
	public AccoNonHotelRequiredLic updateImpl(
		AccoNonHotelRequiredLic accoNonHotelRequiredLic) {

		boolean isNew = accoNonHotelRequiredLic.isNew();

		if (!(accoNonHotelRequiredLic instanceof
				AccoNonHotelRequiredLicModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(accoNonHotelRequiredLic.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					accoNonHotelRequiredLic);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in accoNonHotelRequiredLic proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AccoNonHotelRequiredLic implementation " +
					accoNonHotelRequiredLic.getClass());
		}

		AccoNonHotelRequiredLicModelImpl accoNonHotelRequiredLicModelImpl =
			(AccoNonHotelRequiredLicModelImpl)accoNonHotelRequiredLic;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (accoNonHotelRequiredLic.getCreateDate() == null)) {
			if (serviceContext == null) {
				accoNonHotelRequiredLic.setCreateDate(date);
			}
			else {
				accoNonHotelRequiredLic.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!accoNonHotelRequiredLicModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				accoNonHotelRequiredLic.setModifiedDate(date);
			}
			else {
				accoNonHotelRequiredLic.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(accoNonHotelRequiredLic);
			}
			else {
				accoNonHotelRequiredLic =
					(AccoNonHotelRequiredLic)session.merge(
						accoNonHotelRequiredLic);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AccoNonHotelRequiredLicImpl.class, accoNonHotelRequiredLicModelImpl,
			false, true);

		cacheUniqueFindersCache(accoNonHotelRequiredLicModelImpl);

		if (isNew) {
			accoNonHotelRequiredLic.setNew(false);
		}

		accoNonHotelRequiredLic.resetOriginalValues();

		return accoNonHotelRequiredLic;
	}

	/**
	 * Returns the acco non hotel required lic with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the acco non hotel required lic
	 * @return the acco non hotel required lic
	 * @throws NoSuchAccoNonHotelRequiredLicException if a acco non hotel required lic with the primary key could not be found
	 */
	@Override
	public AccoNonHotelRequiredLic findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAccoNonHotelRequiredLicException {

		AccoNonHotelRequiredLic accoNonHotelRequiredLic = fetchByPrimaryKey(
			primaryKey);

		if (accoNonHotelRequiredLic == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAccoNonHotelRequiredLicException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return accoNonHotelRequiredLic;
	}

	/**
	 * Returns the acco non hotel required lic with the primary key or throws a <code>NoSuchAccoNonHotelRequiredLicException</code> if it could not be found.
	 *
	 * @param accoNonHotelRequiredLicId the primary key of the acco non hotel required lic
	 * @return the acco non hotel required lic
	 * @throws NoSuchAccoNonHotelRequiredLicException if a acco non hotel required lic with the primary key could not be found
	 */
	@Override
	public AccoNonHotelRequiredLic findByPrimaryKey(
			long accoNonHotelRequiredLicId)
		throws NoSuchAccoNonHotelRequiredLicException {

		return findByPrimaryKey((Serializable)accoNonHotelRequiredLicId);
	}

	/**
	 * Returns the acco non hotel required lic with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param accoNonHotelRequiredLicId the primary key of the acco non hotel required lic
	 * @return the acco non hotel required lic, or <code>null</code> if a acco non hotel required lic with the primary key could not be found
	 */
	@Override
	public AccoNonHotelRequiredLic fetchByPrimaryKey(
		long accoNonHotelRequiredLicId) {

		return fetchByPrimaryKey((Serializable)accoNonHotelRequiredLicId);
	}

	/**
	 * Returns all the acco non hotel required lics.
	 *
	 * @return the acco non hotel required lics
	 */
	@Override
	public List<AccoNonHotelRequiredLic> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the acco non hotel required lics.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoNonHotelRequiredLicModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acco non hotel required lics
	 * @param end the upper bound of the range of acco non hotel required lics (not inclusive)
	 * @return the range of acco non hotel required lics
	 */
	@Override
	public List<AccoNonHotelRequiredLic> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the acco non hotel required lics.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoNonHotelRequiredLicModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acco non hotel required lics
	 * @param end the upper bound of the range of acco non hotel required lics (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acco non hotel required lics
	 */
	@Override
	public List<AccoNonHotelRequiredLic> findAll(
		int start, int end,
		OrderByComparator<AccoNonHotelRequiredLic> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the acco non hotel required lics.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoNonHotelRequiredLicModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acco non hotel required lics
	 * @param end the upper bound of the range of acco non hotel required lics (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acco non hotel required lics
	 */
	@Override
	public List<AccoNonHotelRequiredLic> findAll(
		int start, int end,
		OrderByComparator<AccoNonHotelRequiredLic> orderByComparator,
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

		List<AccoNonHotelRequiredLic> list = null;

		if (useFinderCache) {
			list = (List<AccoNonHotelRequiredLic>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ACCONONHOTELREQUIREDLIC);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ACCONONHOTELREQUIREDLIC;

				sql = sql.concat(
					AccoNonHotelRequiredLicModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AccoNonHotelRequiredLic>)QueryUtil.list(
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
	 * Removes all the acco non hotel required lics from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AccoNonHotelRequiredLic accoNonHotelRequiredLic : findAll()) {
			remove(accoNonHotelRequiredLic);
		}
	}

	/**
	 * Returns the number of acco non hotel required lics.
	 *
	 * @return the number of acco non hotel required lics
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
					_SQL_COUNT_ACCONONHOTELREQUIREDLIC);

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
		return "accoNonHotelRequiredLicId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ACCONONHOTELREQUIREDLIC;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AccoNonHotelRequiredLicModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the acco non hotel required lic persistence.
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

		AccoNonHotelRequiredLicUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AccoNonHotelRequiredLicUtil.setPersistence(null);

		entityCache.removeCache(AccoNonHotelRequiredLicImpl.class.getName());
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

	private static final String _SQL_SELECT_ACCONONHOTELREQUIREDLIC =
		"SELECT accoNonHotelRequiredLic FROM AccoNonHotelRequiredLic accoNonHotelRequiredLic";

	private static final String _SQL_SELECT_ACCONONHOTELREQUIREDLIC_WHERE =
		"SELECT accoNonHotelRequiredLic FROM AccoNonHotelRequiredLic accoNonHotelRequiredLic WHERE ";

	private static final String _SQL_COUNT_ACCONONHOTELREQUIREDLIC =
		"SELECT COUNT(accoNonHotelRequiredLic) FROM AccoNonHotelRequiredLic accoNonHotelRequiredLic";

	private static final String _SQL_COUNT_ACCONONHOTELREQUIREDLIC_WHERE =
		"SELECT COUNT(accoNonHotelRequiredLic) FROM AccoNonHotelRequiredLic accoNonHotelRequiredLic WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"accoNonHotelRequiredLic.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AccoNonHotelRequiredLic exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AccoNonHotelRequiredLic exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AccoNonHotelRequiredLicPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}