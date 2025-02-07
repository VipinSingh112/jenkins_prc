/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.stages.services.service.persistence.impl;

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

import com.nbp.manufacturing.application.stages.services.exception.NoSuchManufacturingPermitException;
import com.nbp.manufacturing.application.stages.services.model.ManufacturingPermit;
import com.nbp.manufacturing.application.stages.services.model.ManufacturingPermitTable;
import com.nbp.manufacturing.application.stages.services.model.impl.ManufacturingPermitImpl;
import com.nbp.manufacturing.application.stages.services.model.impl.ManufacturingPermitModelImpl;
import com.nbp.manufacturing.application.stages.services.service.persistence.ManufacturingPermitPersistence;
import com.nbp.manufacturing.application.stages.services.service.persistence.ManufacturingPermitUtil;
import com.nbp.manufacturing.application.stages.services.service.persistence.impl.constants.MANUFACTURING_STAGESPersistenceConstants;

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
 * The persistence implementation for the manufacturing permit service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = ManufacturingPermitPersistence.class)
public class ManufacturingPermitPersistenceImpl
	extends BasePersistenceImpl<ManufacturingPermit>
	implements ManufacturingPermitPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>ManufacturingPermitUtil</code> to access the manufacturing permit persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		ManufacturingPermitImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetManufacturingPermitBY_CI;
	private FinderPath _finderPathCountBygetManufacturingPermitBY_CI;

	/**
	 * Returns the manufacturing permit where caseId = &#63; or throws a <code>NoSuchManufacturingPermitException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching manufacturing permit
	 * @throws NoSuchManufacturingPermitException if a matching manufacturing permit could not be found
	 */
	@Override
	public ManufacturingPermit findBygetManufacturingPermitBY_CI(String caseId)
		throws NoSuchManufacturingPermitException {

		ManufacturingPermit manufacturingPermit =
			fetchBygetManufacturingPermitBY_CI(caseId);

		if (manufacturingPermit == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchManufacturingPermitException(sb.toString());
		}

		return manufacturingPermit;
	}

	/**
	 * Returns the manufacturing permit where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching manufacturing permit, or <code>null</code> if a matching manufacturing permit could not be found
	 */
	@Override
	public ManufacturingPermit fetchBygetManufacturingPermitBY_CI(
		String caseId) {

		return fetchBygetManufacturingPermitBY_CI(caseId, true);
	}

	/**
	 * Returns the manufacturing permit where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching manufacturing permit, or <code>null</code> if a matching manufacturing permit could not be found
	 */
	@Override
	public ManufacturingPermit fetchBygetManufacturingPermitBY_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetManufacturingPermitBY_CI, finderArgs,
				this);
		}

		if (result instanceof ManufacturingPermit) {
			ManufacturingPermit manufacturingPermit =
				(ManufacturingPermit)result;

			if (!Objects.equals(caseId, manufacturingPermit.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_MANUFACTURINGPERMIT_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMANUFACTURINGPERMITBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETMANUFACTURINGPERMITBY_CI_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				List<ManufacturingPermit> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetManufacturingPermitBY_CI,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {caseId};
							}

							_log.warn(
								"ManufacturingPermitPersistenceImpl.fetchBygetManufacturingPermitBY_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					ManufacturingPermit manufacturingPermit = list.get(0);

					result = manufacturingPermit;

					cacheResult(manufacturingPermit);
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
			return (ManufacturingPermit)result;
		}
	}

	/**
	 * Removes the manufacturing permit where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the manufacturing permit that was removed
	 */
	@Override
	public ManufacturingPermit removeBygetManufacturingPermitBY_CI(
			String caseId)
		throws NoSuchManufacturingPermitException {

		ManufacturingPermit manufacturingPermit =
			findBygetManufacturingPermitBY_CI(caseId);

		return remove(manufacturingPermit);
	}

	/**
	 * Returns the number of manufacturing permits where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching manufacturing permits
	 */
	@Override
	public int countBygetManufacturingPermitBY_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetManufacturingPermitBY_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MANUFACTURINGPERMIT_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMANUFACTURINGPERMITBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETMANUFACTURINGPERMITBY_CI_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
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
		_FINDER_COLUMN_GETMANUFACTURINGPERMITBY_CI_CASEID_2 =
			"manufacturingPermit.caseId = ?";

	private static final String
		_FINDER_COLUMN_GETMANUFACTURINGPERMITBY_CI_CASEID_3 =
			"(manufacturingPermit.caseId IS NULL OR manufacturingPermit.caseId = '')";

	private FinderPath _finderPathFetchBygetManufacturingPermitBY_PermitNumber;
	private FinderPath _finderPathCountBygetManufacturingPermitBY_PermitNumber;

	/**
	 * Returns the manufacturing permit where PIRPermtNumber = &#63; or throws a <code>NoSuchManufacturingPermitException</code> if it could not be found.
	 *
	 * @param PIRPermtNumber the pir permt number
	 * @return the matching manufacturing permit
	 * @throws NoSuchManufacturingPermitException if a matching manufacturing permit could not be found
	 */
	@Override
	public ManufacturingPermit findBygetManufacturingPermitBY_PermitNumber(
			String PIRPermtNumber)
		throws NoSuchManufacturingPermitException {

		ManufacturingPermit manufacturingPermit =
			fetchBygetManufacturingPermitBY_PermitNumber(PIRPermtNumber);

		if (manufacturingPermit == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("PIRPermtNumber=");
			sb.append(PIRPermtNumber);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchManufacturingPermitException(sb.toString());
		}

		return manufacturingPermit;
	}

	/**
	 * Returns the manufacturing permit where PIRPermtNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param PIRPermtNumber the pir permt number
	 * @return the matching manufacturing permit, or <code>null</code> if a matching manufacturing permit could not be found
	 */
	@Override
	public ManufacturingPermit fetchBygetManufacturingPermitBY_PermitNumber(
		String PIRPermtNumber) {

		return fetchBygetManufacturingPermitBY_PermitNumber(
			PIRPermtNumber, true);
	}

	/**
	 * Returns the manufacturing permit where PIRPermtNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param PIRPermtNumber the pir permt number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching manufacturing permit, or <code>null</code> if a matching manufacturing permit could not be found
	 */
	@Override
	public ManufacturingPermit fetchBygetManufacturingPermitBY_PermitNumber(
		String PIRPermtNumber, boolean useFinderCache) {

		PIRPermtNumber = Objects.toString(PIRPermtNumber, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {PIRPermtNumber};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetManufacturingPermitBY_PermitNumber,
				finderArgs, this);
		}

		if (result instanceof ManufacturingPermit) {
			ManufacturingPermit manufacturingPermit =
				(ManufacturingPermit)result;

			if (!Objects.equals(
					PIRPermtNumber, manufacturingPermit.getPIRPermtNumber())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_MANUFACTURINGPERMIT_WHERE);

			boolean bindPIRPermtNumber = false;

			if (PIRPermtNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETMANUFACTURINGPERMITBY_PERMITNUMBER_PIRPERMTNUMBER_3);
			}
			else {
				bindPIRPermtNumber = true;

				sb.append(
					_FINDER_COLUMN_GETMANUFACTURINGPERMITBY_PERMITNUMBER_PIRPERMTNUMBER_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindPIRPermtNumber) {
					queryPos.add(PIRPermtNumber);
				}

				List<ManufacturingPermit> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetManufacturingPermitBY_PermitNumber,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {PIRPermtNumber};
							}

							_log.warn(
								"ManufacturingPermitPersistenceImpl.fetchBygetManufacturingPermitBY_PermitNumber(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					ManufacturingPermit manufacturingPermit = list.get(0);

					result = manufacturingPermit;

					cacheResult(manufacturingPermit);
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
			return (ManufacturingPermit)result;
		}
	}

	/**
	 * Removes the manufacturing permit where PIRPermtNumber = &#63; from the database.
	 *
	 * @param PIRPermtNumber the pir permt number
	 * @return the manufacturing permit that was removed
	 */
	@Override
	public ManufacturingPermit removeBygetManufacturingPermitBY_PermitNumber(
			String PIRPermtNumber)
		throws NoSuchManufacturingPermitException {

		ManufacturingPermit manufacturingPermit =
			findBygetManufacturingPermitBY_PermitNumber(PIRPermtNumber);

		return remove(manufacturingPermit);
	}

	/**
	 * Returns the number of manufacturing permits where PIRPermtNumber = &#63;.
	 *
	 * @param PIRPermtNumber the pir permt number
	 * @return the number of matching manufacturing permits
	 */
	@Override
	public int countBygetManufacturingPermitBY_PermitNumber(
		String PIRPermtNumber) {

		PIRPermtNumber = Objects.toString(PIRPermtNumber, "");

		FinderPath finderPath =
			_finderPathCountBygetManufacturingPermitBY_PermitNumber;

		Object[] finderArgs = new Object[] {PIRPermtNumber};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MANUFACTURINGPERMIT_WHERE);

			boolean bindPIRPermtNumber = false;

			if (PIRPermtNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETMANUFACTURINGPERMITBY_PERMITNUMBER_PIRPERMTNUMBER_3);
			}
			else {
				bindPIRPermtNumber = true;

				sb.append(
					_FINDER_COLUMN_GETMANUFACTURINGPERMITBY_PERMITNUMBER_PIRPERMTNUMBER_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindPIRPermtNumber) {
					queryPos.add(PIRPermtNumber);
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
		_FINDER_COLUMN_GETMANUFACTURINGPERMITBY_PERMITNUMBER_PIRPERMTNUMBER_2 =
			"manufacturingPermit.PIRPermtNumber = ?";

	private static final String
		_FINDER_COLUMN_GETMANUFACTURINGPERMITBY_PERMITNUMBER_PIRPERMTNUMBER_3 =
			"(manufacturingPermit.PIRPermtNumber IS NULL OR manufacturingPermit.PIRPermtNumber = '')";

	public ManufacturingPermitPersistenceImpl() {
		setModelClass(ManufacturingPermit.class);

		setModelImplClass(ManufacturingPermitImpl.class);
		setModelPKClass(long.class);

		setTable(ManufacturingPermitTable.INSTANCE);
	}

	/**
	 * Caches the manufacturing permit in the entity cache if it is enabled.
	 *
	 * @param manufacturingPermit the manufacturing permit
	 */
	@Override
	public void cacheResult(ManufacturingPermit manufacturingPermit) {
		entityCache.putResult(
			ManufacturingPermitImpl.class, manufacturingPermit.getPrimaryKey(),
			manufacturingPermit);

		finderCache.putResult(
			_finderPathFetchBygetManufacturingPermitBY_CI,
			new Object[] {manufacturingPermit.getCaseId()},
			manufacturingPermit);

		finderCache.putResult(
			_finderPathFetchBygetManufacturingPermitBY_PermitNumber,
			new Object[] {manufacturingPermit.getPIRPermtNumber()},
			manufacturingPermit);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the manufacturing permits in the entity cache if it is enabled.
	 *
	 * @param manufacturingPermits the manufacturing permits
	 */
	@Override
	public void cacheResult(List<ManufacturingPermit> manufacturingPermits) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (manufacturingPermits.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (ManufacturingPermit manufacturingPermit : manufacturingPermits) {
			if (entityCache.getResult(
					ManufacturingPermitImpl.class,
					manufacturingPermit.getPrimaryKey()) == null) {

				cacheResult(manufacturingPermit);
			}
		}
	}

	/**
	 * Clears the cache for all manufacturing permits.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ManufacturingPermitImpl.class);

		finderCache.clearCache(ManufacturingPermitImpl.class);
	}

	/**
	 * Clears the cache for the manufacturing permit.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ManufacturingPermit manufacturingPermit) {
		entityCache.removeResult(
			ManufacturingPermitImpl.class, manufacturingPermit);
	}

	@Override
	public void clearCache(List<ManufacturingPermit> manufacturingPermits) {
		for (ManufacturingPermit manufacturingPermit : manufacturingPermits) {
			entityCache.removeResult(
				ManufacturingPermitImpl.class, manufacturingPermit);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(ManufacturingPermitImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(ManufacturingPermitImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		ManufacturingPermitModelImpl manufacturingPermitModelImpl) {

		Object[] args = new Object[] {manufacturingPermitModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountBygetManufacturingPermitBY_CI, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetManufacturingPermitBY_CI, args,
			manufacturingPermitModelImpl);

		args = new Object[] {manufacturingPermitModelImpl.getPIRPermtNumber()};

		finderCache.putResult(
			_finderPathCountBygetManufacturingPermitBY_PermitNumber, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetManufacturingPermitBY_PermitNumber, args,
			manufacturingPermitModelImpl);
	}

	/**
	 * Creates a new manufacturing permit with the primary key. Does not add the manufacturing permit to the database.
	 *
	 * @param manufacturingPermitId the primary key for the new manufacturing permit
	 * @return the new manufacturing permit
	 */
	@Override
	public ManufacturingPermit create(long manufacturingPermitId) {
		ManufacturingPermit manufacturingPermit = new ManufacturingPermitImpl();

		manufacturingPermit.setNew(true);
		manufacturingPermit.setPrimaryKey(manufacturingPermitId);

		manufacturingPermit.setCompanyId(CompanyThreadLocal.getCompanyId());

		return manufacturingPermit;
	}

	/**
	 * Removes the manufacturing permit with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param manufacturingPermitId the primary key of the manufacturing permit
	 * @return the manufacturing permit that was removed
	 * @throws NoSuchManufacturingPermitException if a manufacturing permit with the primary key could not be found
	 */
	@Override
	public ManufacturingPermit remove(long manufacturingPermitId)
		throws NoSuchManufacturingPermitException {

		return remove((Serializable)manufacturingPermitId);
	}

	/**
	 * Removes the manufacturing permit with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the manufacturing permit
	 * @return the manufacturing permit that was removed
	 * @throws NoSuchManufacturingPermitException if a manufacturing permit with the primary key could not be found
	 */
	@Override
	public ManufacturingPermit remove(Serializable primaryKey)
		throws NoSuchManufacturingPermitException {

		Session session = null;

		try {
			session = openSession();

			ManufacturingPermit manufacturingPermit =
				(ManufacturingPermit)session.get(
					ManufacturingPermitImpl.class, primaryKey);

			if (manufacturingPermit == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchManufacturingPermitException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(manufacturingPermit);
		}
		catch (NoSuchManufacturingPermitException noSuchEntityException) {
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
	protected ManufacturingPermit removeImpl(
		ManufacturingPermit manufacturingPermit) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(manufacturingPermit)) {
				manufacturingPermit = (ManufacturingPermit)session.get(
					ManufacturingPermitImpl.class,
					manufacturingPermit.getPrimaryKeyObj());
			}

			if (manufacturingPermit != null) {
				session.delete(manufacturingPermit);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (manufacturingPermit != null) {
			clearCache(manufacturingPermit);
		}

		return manufacturingPermit;
	}

	@Override
	public ManufacturingPermit updateImpl(
		ManufacturingPermit manufacturingPermit) {

		boolean isNew = manufacturingPermit.isNew();

		if (!(manufacturingPermit instanceof ManufacturingPermitModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(manufacturingPermit.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					manufacturingPermit);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in manufacturingPermit proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom ManufacturingPermit implementation " +
					manufacturingPermit.getClass());
		}

		ManufacturingPermitModelImpl manufacturingPermitModelImpl =
			(ManufacturingPermitModelImpl)manufacturingPermit;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (manufacturingPermit.getCreateDate() == null)) {
			if (serviceContext == null) {
				manufacturingPermit.setCreateDate(date);
			}
			else {
				manufacturingPermit.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!manufacturingPermitModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				manufacturingPermit.setModifiedDate(date);
			}
			else {
				manufacturingPermit.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(manufacturingPermit);
			}
			else {
				manufacturingPermit = (ManufacturingPermit)session.merge(
					manufacturingPermit);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			ManufacturingPermitImpl.class, manufacturingPermitModelImpl, false,
			true);

		cacheUniqueFindersCache(manufacturingPermitModelImpl);

		if (isNew) {
			manufacturingPermit.setNew(false);
		}

		manufacturingPermit.resetOriginalValues();

		return manufacturingPermit;
	}

	/**
	 * Returns the manufacturing permit with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the manufacturing permit
	 * @return the manufacturing permit
	 * @throws NoSuchManufacturingPermitException if a manufacturing permit with the primary key could not be found
	 */
	@Override
	public ManufacturingPermit findByPrimaryKey(Serializable primaryKey)
		throws NoSuchManufacturingPermitException {

		ManufacturingPermit manufacturingPermit = fetchByPrimaryKey(primaryKey);

		if (manufacturingPermit == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchManufacturingPermitException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return manufacturingPermit;
	}

	/**
	 * Returns the manufacturing permit with the primary key or throws a <code>NoSuchManufacturingPermitException</code> if it could not be found.
	 *
	 * @param manufacturingPermitId the primary key of the manufacturing permit
	 * @return the manufacturing permit
	 * @throws NoSuchManufacturingPermitException if a manufacturing permit with the primary key could not be found
	 */
	@Override
	public ManufacturingPermit findByPrimaryKey(long manufacturingPermitId)
		throws NoSuchManufacturingPermitException {

		return findByPrimaryKey((Serializable)manufacturingPermitId);
	}

	/**
	 * Returns the manufacturing permit with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param manufacturingPermitId the primary key of the manufacturing permit
	 * @return the manufacturing permit, or <code>null</code> if a manufacturing permit with the primary key could not be found
	 */
	@Override
	public ManufacturingPermit fetchByPrimaryKey(long manufacturingPermitId) {
		return fetchByPrimaryKey((Serializable)manufacturingPermitId);
	}

	/**
	 * Returns all the manufacturing permits.
	 *
	 * @return the manufacturing permits
	 */
	@Override
	public List<ManufacturingPermit> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the manufacturing permits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingPermitModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manufacturing permits
	 * @param end the upper bound of the range of manufacturing permits (not inclusive)
	 * @return the range of manufacturing permits
	 */
	@Override
	public List<ManufacturingPermit> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the manufacturing permits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingPermitModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manufacturing permits
	 * @param end the upper bound of the range of manufacturing permits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of manufacturing permits
	 */
	@Override
	public List<ManufacturingPermit> findAll(
		int start, int end,
		OrderByComparator<ManufacturingPermit> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the manufacturing permits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingPermitModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manufacturing permits
	 * @param end the upper bound of the range of manufacturing permits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of manufacturing permits
	 */
	@Override
	public List<ManufacturingPermit> findAll(
		int start, int end,
		OrderByComparator<ManufacturingPermit> orderByComparator,
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

		List<ManufacturingPermit> list = null;

		if (useFinderCache) {
			list = (List<ManufacturingPermit>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_MANUFACTURINGPERMIT);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_MANUFACTURINGPERMIT;

				sql = sql.concat(ManufacturingPermitModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<ManufacturingPermit>)QueryUtil.list(
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
	 * Removes all the manufacturing permits from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ManufacturingPermit manufacturingPermit : findAll()) {
			remove(manufacturingPermit);
		}
	}

	/**
	 * Returns the number of manufacturing permits.
	 *
	 * @return the number of manufacturing permits
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
					_SQL_COUNT_MANUFACTURINGPERMIT);

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
		return "manufacturingPermitId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_MANUFACTURINGPERMIT;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return ManufacturingPermitModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the manufacturing permit persistence.
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

		_finderPathFetchBygetManufacturingPermitBY_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetManufacturingPermitBY_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetManufacturingPermitBY_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetManufacturingPermitBY_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathFetchBygetManufacturingPermitBY_PermitNumber =
			new FinderPath(
				FINDER_CLASS_NAME_ENTITY,
				"fetchBygetManufacturingPermitBY_PermitNumber",
				new String[] {String.class.getName()},
				new String[] {"PIRPermtNumber"}, true);

		_finderPathCountBygetManufacturingPermitBY_PermitNumber =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"countBygetManufacturingPermitBY_PermitNumber",
				new String[] {String.class.getName()},
				new String[] {"PIRPermtNumber"}, false);

		ManufacturingPermitUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		ManufacturingPermitUtil.setPersistence(null);

		entityCache.removeCache(ManufacturingPermitImpl.class.getName());
	}

	@Override
	@Reference(
		target = MANUFACTURING_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = MANUFACTURING_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = MANUFACTURING_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_MANUFACTURINGPERMIT =
		"SELECT manufacturingPermit FROM ManufacturingPermit manufacturingPermit";

	private static final String _SQL_SELECT_MANUFACTURINGPERMIT_WHERE =
		"SELECT manufacturingPermit FROM ManufacturingPermit manufacturingPermit WHERE ";

	private static final String _SQL_COUNT_MANUFACTURINGPERMIT =
		"SELECT COUNT(manufacturingPermit) FROM ManufacturingPermit manufacturingPermit";

	private static final String _SQL_COUNT_MANUFACTURINGPERMIT_WHERE =
		"SELECT COUNT(manufacturingPermit) FROM ManufacturingPermit manufacturingPermit WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "manufacturingPermit.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No ManufacturingPermit exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No ManufacturingPermit exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		ManufacturingPermitPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}