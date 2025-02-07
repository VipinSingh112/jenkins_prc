/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.application.form.service.service.persistence.impl;

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

import com.nbp.wra.application.form.service.exception.NoSuchLicenceToWellDrillerException;
import com.nbp.wra.application.form.service.model.LicenceToWellDriller;
import com.nbp.wra.application.form.service.model.LicenceToWellDrillerTable;
import com.nbp.wra.application.form.service.model.impl.LicenceToWellDrillerImpl;
import com.nbp.wra.application.form.service.model.impl.LicenceToWellDrillerModelImpl;
import com.nbp.wra.application.form.service.service.persistence.LicenceToWellDrillerPersistence;
import com.nbp.wra.application.form.service.service.persistence.LicenceToWellDrillerUtil;
import com.nbp.wra.application.form.service.service.persistence.impl.constants.WRA_APPLICATIONPersistenceConstants;

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
 * The persistence implementation for the licence to well driller service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = LicenceToWellDrillerPersistence.class)
public class LicenceToWellDrillerPersistenceImpl
	extends BasePersistenceImpl<LicenceToWellDriller>
	implements LicenceToWellDrillerPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>LicenceToWellDrillerUtil</code> to access the licence to well driller persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		LicenceToWellDrillerImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetWRA_By_Id;
	private FinderPath _finderPathCountBygetWRA_By_Id;

	/**
	 * Returns the licence to well driller where wraApplicationId = &#63; or throws a <code>NoSuchLicenceToWellDrillerException</code> if it could not be found.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the matching licence to well driller
	 * @throws NoSuchLicenceToWellDrillerException if a matching licence to well driller could not be found
	 */
	@Override
	public LicenceToWellDriller findBygetWRA_By_Id(long wraApplicationId)
		throws NoSuchLicenceToWellDrillerException {

		LicenceToWellDriller licenceToWellDriller = fetchBygetWRA_By_Id(
			wraApplicationId);

		if (licenceToWellDriller == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("wraApplicationId=");
			sb.append(wraApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchLicenceToWellDrillerException(sb.toString());
		}

		return licenceToWellDriller;
	}

	/**
	 * Returns the licence to well driller where wraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the matching licence to well driller, or <code>null</code> if a matching licence to well driller could not be found
	 */
	@Override
	public LicenceToWellDriller fetchBygetWRA_By_Id(long wraApplicationId) {
		return fetchBygetWRA_By_Id(wraApplicationId, true);
	}

	/**
	 * Returns the licence to well driller where wraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param wraApplicationId the wra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching licence to well driller, or <code>null</code> if a matching licence to well driller could not be found
	 */
	@Override
	public LicenceToWellDriller fetchBygetWRA_By_Id(
		long wraApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {wraApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetWRA_By_Id, finderArgs, this);
		}

		if (result instanceof LicenceToWellDriller) {
			LicenceToWellDriller licenceToWellDriller =
				(LicenceToWellDriller)result;

			if (wraApplicationId !=
					licenceToWellDriller.getWraApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_LICENCETOWELLDRILLER_WHERE);

			sb.append(_FINDER_COLUMN_GETWRA_BY_ID_WRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(wraApplicationId);

				List<LicenceToWellDriller> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetWRA_By_Id, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {wraApplicationId};
							}

							_log.warn(
								"LicenceToWellDrillerPersistenceImpl.fetchBygetWRA_By_Id(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					LicenceToWellDriller licenceToWellDriller = list.get(0);

					result = licenceToWellDriller;

					cacheResult(licenceToWellDriller);
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
			return (LicenceToWellDriller)result;
		}
	}

	/**
	 * Removes the licence to well driller where wraApplicationId = &#63; from the database.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the licence to well driller that was removed
	 */
	@Override
	public LicenceToWellDriller removeBygetWRA_By_Id(long wraApplicationId)
		throws NoSuchLicenceToWellDrillerException {

		LicenceToWellDriller licenceToWellDriller = findBygetWRA_By_Id(
			wraApplicationId);

		return remove(licenceToWellDriller);
	}

	/**
	 * Returns the number of licence to well drillers where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the number of matching licence to well drillers
	 */
	@Override
	public int countBygetWRA_By_Id(long wraApplicationId) {
		FinderPath finderPath = _finderPathCountBygetWRA_By_Id;

		Object[] finderArgs = new Object[] {wraApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_LICENCETOWELLDRILLER_WHERE);

			sb.append(_FINDER_COLUMN_GETWRA_BY_ID_WRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(wraApplicationId);

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

	private static final String _FINDER_COLUMN_GETWRA_BY_ID_WRAAPPLICATIONID_2 =
		"licenceToWellDriller.wraApplicationId = ?";

	public LicenceToWellDrillerPersistenceImpl() {
		setModelClass(LicenceToWellDriller.class);

		setModelImplClass(LicenceToWellDrillerImpl.class);
		setModelPKClass(long.class);

		setTable(LicenceToWellDrillerTable.INSTANCE);
	}

	/**
	 * Caches the licence to well driller in the entity cache if it is enabled.
	 *
	 * @param licenceToWellDriller the licence to well driller
	 */
	@Override
	public void cacheResult(LicenceToWellDriller licenceToWellDriller) {
		entityCache.putResult(
			LicenceToWellDrillerImpl.class,
			licenceToWellDriller.getPrimaryKey(), licenceToWellDriller);

		finderCache.putResult(
			_finderPathFetchBygetWRA_By_Id,
			new Object[] {licenceToWellDriller.getWraApplicationId()},
			licenceToWellDriller);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the licence to well drillers in the entity cache if it is enabled.
	 *
	 * @param licenceToWellDrillers the licence to well drillers
	 */
	@Override
	public void cacheResult(List<LicenceToWellDriller> licenceToWellDrillers) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (licenceToWellDrillers.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (LicenceToWellDriller licenceToWellDriller :
				licenceToWellDrillers) {

			if (entityCache.getResult(
					LicenceToWellDrillerImpl.class,
					licenceToWellDriller.getPrimaryKey()) == null) {

				cacheResult(licenceToWellDriller);
			}
		}
	}

	/**
	 * Clears the cache for all licence to well drillers.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(LicenceToWellDrillerImpl.class);

		finderCache.clearCache(LicenceToWellDrillerImpl.class);
	}

	/**
	 * Clears the cache for the licence to well driller.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(LicenceToWellDriller licenceToWellDriller) {
		entityCache.removeResult(
			LicenceToWellDrillerImpl.class, licenceToWellDriller);
	}

	@Override
	public void clearCache(List<LicenceToWellDriller> licenceToWellDrillers) {
		for (LicenceToWellDriller licenceToWellDriller :
				licenceToWellDrillers) {

			entityCache.removeResult(
				LicenceToWellDrillerImpl.class, licenceToWellDriller);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(LicenceToWellDrillerImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				LicenceToWellDrillerImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		LicenceToWellDrillerModelImpl licenceToWellDrillerModelImpl) {

		Object[] args = new Object[] {
			licenceToWellDrillerModelImpl.getWraApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetWRA_By_Id, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetWRA_By_Id, args,
			licenceToWellDrillerModelImpl);
	}

	/**
	 * Creates a new licence to well driller with the primary key. Does not add the licence to well driller to the database.
	 *
	 * @param licenceToWellDrillerId the primary key for the new licence to well driller
	 * @return the new licence to well driller
	 */
	@Override
	public LicenceToWellDriller create(long licenceToWellDrillerId) {
		LicenceToWellDriller licenceToWellDriller =
			new LicenceToWellDrillerImpl();

		licenceToWellDriller.setNew(true);
		licenceToWellDriller.setPrimaryKey(licenceToWellDrillerId);

		licenceToWellDriller.setCompanyId(CompanyThreadLocal.getCompanyId());

		return licenceToWellDriller;
	}

	/**
	 * Removes the licence to well driller with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param licenceToWellDrillerId the primary key of the licence to well driller
	 * @return the licence to well driller that was removed
	 * @throws NoSuchLicenceToWellDrillerException if a licence to well driller with the primary key could not be found
	 */
	@Override
	public LicenceToWellDriller remove(long licenceToWellDrillerId)
		throws NoSuchLicenceToWellDrillerException {

		return remove((Serializable)licenceToWellDrillerId);
	}

	/**
	 * Removes the licence to well driller with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the licence to well driller
	 * @return the licence to well driller that was removed
	 * @throws NoSuchLicenceToWellDrillerException if a licence to well driller with the primary key could not be found
	 */
	@Override
	public LicenceToWellDriller remove(Serializable primaryKey)
		throws NoSuchLicenceToWellDrillerException {

		Session session = null;

		try {
			session = openSession();

			LicenceToWellDriller licenceToWellDriller =
				(LicenceToWellDriller)session.get(
					LicenceToWellDrillerImpl.class, primaryKey);

			if (licenceToWellDriller == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchLicenceToWellDrillerException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(licenceToWellDriller);
		}
		catch (NoSuchLicenceToWellDrillerException noSuchEntityException) {
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
	protected LicenceToWellDriller removeImpl(
		LicenceToWellDriller licenceToWellDriller) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(licenceToWellDriller)) {
				licenceToWellDriller = (LicenceToWellDriller)session.get(
					LicenceToWellDrillerImpl.class,
					licenceToWellDriller.getPrimaryKeyObj());
			}

			if (licenceToWellDriller != null) {
				session.delete(licenceToWellDriller);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (licenceToWellDriller != null) {
			clearCache(licenceToWellDriller);
		}

		return licenceToWellDriller;
	}

	@Override
	public LicenceToWellDriller updateImpl(
		LicenceToWellDriller licenceToWellDriller) {

		boolean isNew = licenceToWellDriller.isNew();

		if (!(licenceToWellDriller instanceof LicenceToWellDrillerModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(licenceToWellDriller.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					licenceToWellDriller);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in licenceToWellDriller proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom LicenceToWellDriller implementation " +
					licenceToWellDriller.getClass());
		}

		LicenceToWellDrillerModelImpl licenceToWellDrillerModelImpl =
			(LicenceToWellDrillerModelImpl)licenceToWellDriller;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (licenceToWellDriller.getCreateDate() == null)) {
			if (serviceContext == null) {
				licenceToWellDriller.setCreateDate(date);
			}
			else {
				licenceToWellDriller.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!licenceToWellDrillerModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				licenceToWellDriller.setModifiedDate(date);
			}
			else {
				licenceToWellDriller.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(licenceToWellDriller);
			}
			else {
				licenceToWellDriller = (LicenceToWellDriller)session.merge(
					licenceToWellDriller);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			LicenceToWellDrillerImpl.class, licenceToWellDrillerModelImpl,
			false, true);

		cacheUniqueFindersCache(licenceToWellDrillerModelImpl);

		if (isNew) {
			licenceToWellDriller.setNew(false);
		}

		licenceToWellDriller.resetOriginalValues();

		return licenceToWellDriller;
	}

	/**
	 * Returns the licence to well driller with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the licence to well driller
	 * @return the licence to well driller
	 * @throws NoSuchLicenceToWellDrillerException if a licence to well driller with the primary key could not be found
	 */
	@Override
	public LicenceToWellDriller findByPrimaryKey(Serializable primaryKey)
		throws NoSuchLicenceToWellDrillerException {

		LicenceToWellDriller licenceToWellDriller = fetchByPrimaryKey(
			primaryKey);

		if (licenceToWellDriller == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchLicenceToWellDrillerException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return licenceToWellDriller;
	}

	/**
	 * Returns the licence to well driller with the primary key or throws a <code>NoSuchLicenceToWellDrillerException</code> if it could not be found.
	 *
	 * @param licenceToWellDrillerId the primary key of the licence to well driller
	 * @return the licence to well driller
	 * @throws NoSuchLicenceToWellDrillerException if a licence to well driller with the primary key could not be found
	 */
	@Override
	public LicenceToWellDriller findByPrimaryKey(long licenceToWellDrillerId)
		throws NoSuchLicenceToWellDrillerException {

		return findByPrimaryKey((Serializable)licenceToWellDrillerId);
	}

	/**
	 * Returns the licence to well driller with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param licenceToWellDrillerId the primary key of the licence to well driller
	 * @return the licence to well driller, or <code>null</code> if a licence to well driller with the primary key could not be found
	 */
	@Override
	public LicenceToWellDriller fetchByPrimaryKey(long licenceToWellDrillerId) {
		return fetchByPrimaryKey((Serializable)licenceToWellDrillerId);
	}

	/**
	 * Returns all the licence to well drillers.
	 *
	 * @return the licence to well drillers
	 */
	@Override
	public List<LicenceToWellDriller> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the licence to well drillers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LicenceToWellDrillerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of licence to well drillers
	 * @param end the upper bound of the range of licence to well drillers (not inclusive)
	 * @return the range of licence to well drillers
	 */
	@Override
	public List<LicenceToWellDriller> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the licence to well drillers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LicenceToWellDrillerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of licence to well drillers
	 * @param end the upper bound of the range of licence to well drillers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of licence to well drillers
	 */
	@Override
	public List<LicenceToWellDriller> findAll(
		int start, int end,
		OrderByComparator<LicenceToWellDriller> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the licence to well drillers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LicenceToWellDrillerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of licence to well drillers
	 * @param end the upper bound of the range of licence to well drillers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of licence to well drillers
	 */
	@Override
	public List<LicenceToWellDriller> findAll(
		int start, int end,
		OrderByComparator<LicenceToWellDriller> orderByComparator,
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

		List<LicenceToWellDriller> list = null;

		if (useFinderCache) {
			list = (List<LicenceToWellDriller>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_LICENCETOWELLDRILLER);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_LICENCETOWELLDRILLER;

				sql = sql.concat(LicenceToWellDrillerModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<LicenceToWellDriller>)QueryUtil.list(
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
	 * Removes all the licence to well drillers from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (LicenceToWellDriller licenceToWellDriller : findAll()) {
			remove(licenceToWellDriller);
		}
	}

	/**
	 * Returns the number of licence to well drillers.
	 *
	 * @return the number of licence to well drillers
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
					_SQL_COUNT_LICENCETOWELLDRILLER);

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
		return "licenceToWellDrillerId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_LICENCETOWELLDRILLER;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return LicenceToWellDrillerModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the licence to well driller persistence.
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

		_finderPathFetchBygetWRA_By_Id = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetWRA_By_Id",
			new String[] {Long.class.getName()},
			new String[] {"wraApplicationId"}, true);

		_finderPathCountBygetWRA_By_Id = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetWRA_By_Id",
			new String[] {Long.class.getName()},
			new String[] {"wraApplicationId"}, false);

		LicenceToWellDrillerUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		LicenceToWellDrillerUtil.setPersistence(null);

		entityCache.removeCache(LicenceToWellDrillerImpl.class.getName());
	}

	@Override
	@Reference(
		target = WRA_APPLICATIONPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = WRA_APPLICATIONPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = WRA_APPLICATIONPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_LICENCETOWELLDRILLER =
		"SELECT licenceToWellDriller FROM LicenceToWellDriller licenceToWellDriller";

	private static final String _SQL_SELECT_LICENCETOWELLDRILLER_WHERE =
		"SELECT licenceToWellDriller FROM LicenceToWellDriller licenceToWellDriller WHERE ";

	private static final String _SQL_COUNT_LICENCETOWELLDRILLER =
		"SELECT COUNT(licenceToWellDriller) FROM LicenceToWellDriller licenceToWellDriller";

	private static final String _SQL_COUNT_LICENCETOWELLDRILLER_WHERE =
		"SELECT COUNT(licenceToWellDriller) FROM LicenceToWellDriller licenceToWellDriller WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"licenceToWellDriller.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No LicenceToWellDriller exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No LicenceToWellDriller exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		LicenceToWellDrillerPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}