/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence.impl;

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

import com.nbp.sez.status.application.form.service.exception.NoSuchSezConsultancyInspectionException;
import com.nbp.sez.status.application.form.service.model.SezConsultancyInspection;
import com.nbp.sez.status.application.form.service.model.SezConsultancyInspectionTable;
import com.nbp.sez.status.application.form.service.model.impl.SezConsultancyInspectionImpl;
import com.nbp.sez.status.application.form.service.model.impl.SezConsultancyInspectionModelImpl;
import com.nbp.sez.status.application.form.service.service.persistence.SezConsultancyInspectionPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezConsultancyInspectionUtil;
import com.nbp.sez.status.application.form.service.service.persistence.impl.constants.SEZ_STATUSPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the sez consultancy inspection service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = SezConsultancyInspectionPersistence.class)
public class SezConsultancyInspectionPersistenceImpl
	extends BasePersistenceImpl<SezConsultancyInspection>
	implements SezConsultancyInspectionPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>SezConsultancyInspectionUtil</code> to access the sez consultancy inspection persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		SezConsultancyInspectionImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetSezConsultancyByCat;
	private FinderPath _finderPathCountBygetSezConsultancyByCat;

	/**
	 * Returns the sez consultancy inspection where doYouWant = &#63; or throws a <code>NoSuchSezConsultancyInspectionException</code> if it could not be found.
	 *
	 * @param doYouWant the do you want
	 * @return the matching sez consultancy inspection
	 * @throws NoSuchSezConsultancyInspectionException if a matching sez consultancy inspection could not be found
	 */
	@Override
	public SezConsultancyInspection findBygetSezConsultancyByCat(
			String doYouWant)
		throws NoSuchSezConsultancyInspectionException {

		SezConsultancyInspection sezConsultancyInspection =
			fetchBygetSezConsultancyByCat(doYouWant);

		if (sezConsultancyInspection == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("doYouWant=");
			sb.append(doYouWant);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchSezConsultancyInspectionException(sb.toString());
		}

		return sezConsultancyInspection;
	}

	/**
	 * Returns the sez consultancy inspection where doYouWant = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param doYouWant the do you want
	 * @return the matching sez consultancy inspection, or <code>null</code> if a matching sez consultancy inspection could not be found
	 */
	@Override
	public SezConsultancyInspection fetchBygetSezConsultancyByCat(
		String doYouWant) {

		return fetchBygetSezConsultancyByCat(doYouWant, true);
	}

	/**
	 * Returns the sez consultancy inspection where doYouWant = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param doYouWant the do you want
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez consultancy inspection, or <code>null</code> if a matching sez consultancy inspection could not be found
	 */
	@Override
	public SezConsultancyInspection fetchBygetSezConsultancyByCat(
		String doYouWant, boolean useFinderCache) {

		doYouWant = Objects.toString(doYouWant, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {doYouWant};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetSezConsultancyByCat, finderArgs, this);
		}

		if (result instanceof SezConsultancyInspection) {
			SezConsultancyInspection sezConsultancyInspection =
				(SezConsultancyInspection)result;

			if (!Objects.equals(
					doYouWant, sezConsultancyInspection.getDoYouWant())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_SEZCONSULTANCYINSPECTION_WHERE);

			boolean bindDoYouWant = false;

			if (doYouWant.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETSEZCONSULTANCYBYCAT_DOYOUWANT_3);
			}
			else {
				bindDoYouWant = true;

				sb.append(_FINDER_COLUMN_GETSEZCONSULTANCYBYCAT_DOYOUWANT_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindDoYouWant) {
					queryPos.add(doYouWant);
				}

				List<SezConsultancyInspection> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetSezConsultancyByCat,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {doYouWant};
							}

							_log.warn(
								"SezConsultancyInspectionPersistenceImpl.fetchBygetSezConsultancyByCat(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					SezConsultancyInspection sezConsultancyInspection =
						list.get(0);

					result = sezConsultancyInspection;

					cacheResult(sezConsultancyInspection);
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
			return (SezConsultancyInspection)result;
		}
	}

	/**
	 * Removes the sez consultancy inspection where doYouWant = &#63; from the database.
	 *
	 * @param doYouWant the do you want
	 * @return the sez consultancy inspection that was removed
	 */
	@Override
	public SezConsultancyInspection removeBygetSezConsultancyByCat(
			String doYouWant)
		throws NoSuchSezConsultancyInspectionException {

		SezConsultancyInspection sezConsultancyInspection =
			findBygetSezConsultancyByCat(doYouWant);

		return remove(sezConsultancyInspection);
	}

	/**
	 * Returns the number of sez consultancy inspections where doYouWant = &#63;.
	 *
	 * @param doYouWant the do you want
	 * @return the number of matching sez consultancy inspections
	 */
	@Override
	public int countBygetSezConsultancyByCat(String doYouWant) {
		doYouWant = Objects.toString(doYouWant, "");

		FinderPath finderPath = _finderPathCountBygetSezConsultancyByCat;

		Object[] finderArgs = new Object[] {doYouWant};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SEZCONSULTANCYINSPECTION_WHERE);

			boolean bindDoYouWant = false;

			if (doYouWant.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETSEZCONSULTANCYBYCAT_DOYOUWANT_3);
			}
			else {
				bindDoYouWant = true;

				sb.append(_FINDER_COLUMN_GETSEZCONSULTANCYBYCAT_DOYOUWANT_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindDoYouWant) {
					queryPos.add(doYouWant);
				}

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
		_FINDER_COLUMN_GETSEZCONSULTANCYBYCAT_DOYOUWANT_2 =
			"sezConsultancyInspection.doYouWant = ?";

	private static final String
		_FINDER_COLUMN_GETSEZCONSULTANCYBYCAT_DOYOUWANT_3 =
			"(sezConsultancyInspection.doYouWant IS NULL OR sezConsultancyInspection.doYouWant = '')";

	public SezConsultancyInspectionPersistenceImpl() {
		setModelClass(SezConsultancyInspection.class);

		setModelImplClass(SezConsultancyInspectionImpl.class);
		setModelPKClass(long.class);

		setTable(SezConsultancyInspectionTable.INSTANCE);
	}

	/**
	 * Caches the sez consultancy inspection in the entity cache if it is enabled.
	 *
	 * @param sezConsultancyInspection the sez consultancy inspection
	 */
	@Override
	public void cacheResult(SezConsultancyInspection sezConsultancyInspection) {
		entityCache.putResult(
			SezConsultancyInspectionImpl.class,
			sezConsultancyInspection.getPrimaryKey(), sezConsultancyInspection);

		finderCache.putResult(
			_finderPathFetchBygetSezConsultancyByCat,
			new Object[] {sezConsultancyInspection.getDoYouWant()},
			sezConsultancyInspection);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the sez consultancy inspections in the entity cache if it is enabled.
	 *
	 * @param sezConsultancyInspections the sez consultancy inspections
	 */
	@Override
	public void cacheResult(
		List<SezConsultancyInspection> sezConsultancyInspections) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (sezConsultancyInspections.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (SezConsultancyInspection sezConsultancyInspection :
				sezConsultancyInspections) {

			if (entityCache.getResult(
					SezConsultancyInspectionImpl.class,
					sezConsultancyInspection.getPrimaryKey()) == null) {

				cacheResult(sezConsultancyInspection);
			}
		}
	}

	/**
	 * Clears the cache for all sez consultancy inspections.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SezConsultancyInspectionImpl.class);

		finderCache.clearCache(SezConsultancyInspectionImpl.class);
	}

	/**
	 * Clears the cache for the sez consultancy inspection.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(SezConsultancyInspection sezConsultancyInspection) {
		entityCache.removeResult(
			SezConsultancyInspectionImpl.class, sezConsultancyInspection);
	}

	@Override
	public void clearCache(
		List<SezConsultancyInspection> sezConsultancyInspections) {

		for (SezConsultancyInspection sezConsultancyInspection :
				sezConsultancyInspections) {

			entityCache.removeResult(
				SezConsultancyInspectionImpl.class, sezConsultancyInspection);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(SezConsultancyInspectionImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				SezConsultancyInspectionImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		SezConsultancyInspectionModelImpl sezConsultancyInspectionModelImpl) {

		Object[] args = new Object[] {
			sezConsultancyInspectionModelImpl.getDoYouWant()
		};

		finderCache.putResult(
			_finderPathCountBygetSezConsultancyByCat, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetSezConsultancyByCat, args,
			sezConsultancyInspectionModelImpl);
	}

	/**
	 * Creates a new sez consultancy inspection with the primary key. Does not add the sez consultancy inspection to the database.
	 *
	 * @param sezConsultancyInspectionId the primary key for the new sez consultancy inspection
	 * @return the new sez consultancy inspection
	 */
	@Override
	public SezConsultancyInspection create(long sezConsultancyInspectionId) {
		SezConsultancyInspection sezConsultancyInspection =
			new SezConsultancyInspectionImpl();

		sezConsultancyInspection.setNew(true);
		sezConsultancyInspection.setPrimaryKey(sezConsultancyInspectionId);

		sezConsultancyInspection.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return sezConsultancyInspection;
	}

	/**
	 * Removes the sez consultancy inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezConsultancyInspectionId the primary key of the sez consultancy inspection
	 * @return the sez consultancy inspection that was removed
	 * @throws NoSuchSezConsultancyInspectionException if a sez consultancy inspection with the primary key could not be found
	 */
	@Override
	public SezConsultancyInspection remove(long sezConsultancyInspectionId)
		throws NoSuchSezConsultancyInspectionException {

		return remove((Serializable)sezConsultancyInspectionId);
	}

	/**
	 * Removes the sez consultancy inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sez consultancy inspection
	 * @return the sez consultancy inspection that was removed
	 * @throws NoSuchSezConsultancyInspectionException if a sez consultancy inspection with the primary key could not be found
	 */
	@Override
	public SezConsultancyInspection remove(Serializable primaryKey)
		throws NoSuchSezConsultancyInspectionException {

		Session session = null;

		try {
			session = openSession();

			SezConsultancyInspection sezConsultancyInspection =
				(SezConsultancyInspection)session.get(
					SezConsultancyInspectionImpl.class, primaryKey);

			if (sezConsultancyInspection == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSezConsultancyInspectionException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(sezConsultancyInspection);
		}
		catch (NoSuchSezConsultancyInspectionException noSuchEntityException) {
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
	protected SezConsultancyInspection removeImpl(
		SezConsultancyInspection sezConsultancyInspection) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(sezConsultancyInspection)) {
				sezConsultancyInspection =
					(SezConsultancyInspection)session.get(
						SezConsultancyInspectionImpl.class,
						sezConsultancyInspection.getPrimaryKeyObj());
			}

			if (sezConsultancyInspection != null) {
				session.delete(sezConsultancyInspection);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (sezConsultancyInspection != null) {
			clearCache(sezConsultancyInspection);
		}

		return sezConsultancyInspection;
	}

	@Override
	public SezConsultancyInspection updateImpl(
		SezConsultancyInspection sezConsultancyInspection) {

		boolean isNew = sezConsultancyInspection.isNew();

		if (!(sezConsultancyInspection instanceof
				SezConsultancyInspectionModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(sezConsultancyInspection.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					sezConsultancyInspection);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in sezConsultancyInspection proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom SezConsultancyInspection implementation " +
					sezConsultancyInspection.getClass());
		}

		SezConsultancyInspectionModelImpl sezConsultancyInspectionModelImpl =
			(SezConsultancyInspectionModelImpl)sezConsultancyInspection;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (sezConsultancyInspection.getCreateDate() == null)) {
			if (serviceContext == null) {
				sezConsultancyInspection.setCreateDate(date);
			}
			else {
				sezConsultancyInspection.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!sezConsultancyInspectionModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				sezConsultancyInspection.setModifiedDate(date);
			}
			else {
				sezConsultancyInspection.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(sezConsultancyInspection);
			}
			else {
				sezConsultancyInspection =
					(SezConsultancyInspection)session.merge(
						sezConsultancyInspection);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			SezConsultancyInspectionImpl.class,
			sezConsultancyInspectionModelImpl, false, true);

		cacheUniqueFindersCache(sezConsultancyInspectionModelImpl);

		if (isNew) {
			sezConsultancyInspection.setNew(false);
		}

		sezConsultancyInspection.resetOriginalValues();

		return sezConsultancyInspection;
	}

	/**
	 * Returns the sez consultancy inspection with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sez consultancy inspection
	 * @return the sez consultancy inspection
	 * @throws NoSuchSezConsultancyInspectionException if a sez consultancy inspection with the primary key could not be found
	 */
	@Override
	public SezConsultancyInspection findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSezConsultancyInspectionException {

		SezConsultancyInspection sezConsultancyInspection = fetchByPrimaryKey(
			primaryKey);

		if (sezConsultancyInspection == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSezConsultancyInspectionException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return sezConsultancyInspection;
	}

	/**
	 * Returns the sez consultancy inspection with the primary key or throws a <code>NoSuchSezConsultancyInspectionException</code> if it could not be found.
	 *
	 * @param sezConsultancyInspectionId the primary key of the sez consultancy inspection
	 * @return the sez consultancy inspection
	 * @throws NoSuchSezConsultancyInspectionException if a sez consultancy inspection with the primary key could not be found
	 */
	@Override
	public SezConsultancyInspection findByPrimaryKey(
			long sezConsultancyInspectionId)
		throws NoSuchSezConsultancyInspectionException {

		return findByPrimaryKey((Serializable)sezConsultancyInspectionId);
	}

	/**
	 * Returns the sez consultancy inspection with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezConsultancyInspectionId the primary key of the sez consultancy inspection
	 * @return the sez consultancy inspection, or <code>null</code> if a sez consultancy inspection with the primary key could not be found
	 */
	@Override
	public SezConsultancyInspection fetchByPrimaryKey(
		long sezConsultancyInspectionId) {

		return fetchByPrimaryKey((Serializable)sezConsultancyInspectionId);
	}

	/**
	 * Returns all the sez consultancy inspections.
	 *
	 * @return the sez consultancy inspections
	 */
	@Override
	public List<SezConsultancyInspection> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez consultancy inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezConsultancyInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez consultancy inspections
	 * @param end the upper bound of the range of sez consultancy inspections (not inclusive)
	 * @return the range of sez consultancy inspections
	 */
	@Override
	public List<SezConsultancyInspection> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez consultancy inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezConsultancyInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez consultancy inspections
	 * @param end the upper bound of the range of sez consultancy inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez consultancy inspections
	 */
	@Override
	public List<SezConsultancyInspection> findAll(
		int start, int end,
		OrderByComparator<SezConsultancyInspection> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez consultancy inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezConsultancyInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez consultancy inspections
	 * @param end the upper bound of the range of sez consultancy inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez consultancy inspections
	 */
	@Override
	public List<SezConsultancyInspection> findAll(
		int start, int end,
		OrderByComparator<SezConsultancyInspection> orderByComparator,
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

		List<SezConsultancyInspection> list = null;

		if (useFinderCache) {
			list = (List<SezConsultancyInspection>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_SEZCONSULTANCYINSPECTION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_SEZCONSULTANCYINSPECTION;

				sql = sql.concat(
					SezConsultancyInspectionModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<SezConsultancyInspection>)QueryUtil.list(
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
	 * Removes all the sez consultancy inspections from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SezConsultancyInspection sezConsultancyInspection : findAll()) {
			remove(sezConsultancyInspection);
		}
	}

	/**
	 * Returns the number of sez consultancy inspections.
	 *
	 * @return the number of sez consultancy inspections
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
					_SQL_COUNT_SEZCONSULTANCYINSPECTION);

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
		return "sezConsultancyInspectionId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_SEZCONSULTANCYINSPECTION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SezConsultancyInspectionModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the sez consultancy inspection persistence.
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

		_finderPathFetchBygetSezConsultancyByCat = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetSezConsultancyByCat",
			new String[] {String.class.getName()}, new String[] {"doYouWant"},
			true);

		_finderPathCountBygetSezConsultancyByCat = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetSezConsultancyByCat",
			new String[] {String.class.getName()}, new String[] {"doYouWant"},
			false);

		SezConsultancyInspectionUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		SezConsultancyInspectionUtil.setPersistence(null);

		entityCache.removeCache(SezConsultancyInspectionImpl.class.getName());
	}

	@Override
	@Reference(
		target = SEZ_STATUSPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = SEZ_STATUSPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = SEZ_STATUSPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_SEZCONSULTANCYINSPECTION =
		"SELECT sezConsultancyInspection FROM SezConsultancyInspection sezConsultancyInspection";

	private static final String _SQL_SELECT_SEZCONSULTANCYINSPECTION_WHERE =
		"SELECT sezConsultancyInspection FROM SezConsultancyInspection sezConsultancyInspection WHERE ";

	private static final String _SQL_COUNT_SEZCONSULTANCYINSPECTION =
		"SELECT COUNT(sezConsultancyInspection) FROM SezConsultancyInspection sezConsultancyInspection";

	private static final String _SQL_COUNT_SEZCONSULTANCYINSPECTION_WHERE =
		"SELECT COUNT(sezConsultancyInspection) FROM SezConsultancyInspection sezConsultancyInspection WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"sezConsultancyInspection.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No SezConsultancyInspection exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No SezConsultancyInspection exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		SezConsultancyInspectionPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}