/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.stage.services.service.persistence.impl;

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

import com.nbp.osi.insolvency.stage.services.exception.NoSuchOsiInsolDataVerificationException;
import com.nbp.osi.insolvency.stage.services.model.OsiInsolDataVerification;
import com.nbp.osi.insolvency.stage.services.model.OsiInsolDataVerificationTable;
import com.nbp.osi.insolvency.stage.services.model.impl.OsiInsolDataVerificationImpl;
import com.nbp.osi.insolvency.stage.services.model.impl.OsiInsolDataVerificationModelImpl;
import com.nbp.osi.insolvency.stage.services.service.persistence.OsiInsolDataVerificationPersistence;
import com.nbp.osi.insolvency.stage.services.service.persistence.OsiInsolDataVerificationUtil;
import com.nbp.osi.insolvency.stage.services.service.persistence.impl.constants.OSI_INSOLVENCY_STAGESPersistenceConstants;

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
 * The persistence implementation for the osi insol data verification service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = OsiInsolDataVerificationPersistence.class)
public class OsiInsolDataVerificationPersistenceImpl
	extends BasePersistenceImpl<OsiInsolDataVerification>
	implements OsiInsolDataVerificationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>OsiInsolDataVerificationUtil</code> to access the osi insol data verification persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		OsiInsolDataVerificationImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetOSIIRDataVerificationBy_CI;
	private FinderPath _finderPathCountBygetOSIIRDataVerificationBy_CI;

	/**
	 * Returns the osi insol data verification where caseId = &#63; or throws a <code>NoSuchOsiInsolDataVerificationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching osi insol data verification
	 * @throws NoSuchOsiInsolDataVerificationException if a matching osi insol data verification could not be found
	 */
	@Override
	public OsiInsolDataVerification findBygetOSIIRDataVerificationBy_CI(
			String caseId)
		throws NoSuchOsiInsolDataVerificationException {

		OsiInsolDataVerification osiInsolDataVerification =
			fetchBygetOSIIRDataVerificationBy_CI(caseId);

		if (osiInsolDataVerification == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchOsiInsolDataVerificationException(sb.toString());
		}

		return osiInsolDataVerification;
	}

	/**
	 * Returns the osi insol data verification where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching osi insol data verification, or <code>null</code> if a matching osi insol data verification could not be found
	 */
	@Override
	public OsiInsolDataVerification fetchBygetOSIIRDataVerificationBy_CI(
		String caseId) {

		return fetchBygetOSIIRDataVerificationBy_CI(caseId, true);
	}

	/**
	 * Returns the osi insol data verification where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi insol data verification, or <code>null</code> if a matching osi insol data verification could not be found
	 */
	@Override
	public OsiInsolDataVerification fetchBygetOSIIRDataVerificationBy_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetOSIIRDataVerificationBy_CI, finderArgs,
				this);
		}

		if (result instanceof OsiInsolDataVerification) {
			OsiInsolDataVerification osiInsolDataVerification =
				(OsiInsolDataVerification)result;

			if (!Objects.equals(caseId, osiInsolDataVerification.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_OSIINSOLDATAVERIFICATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETOSIIRDATAVERIFICATIONBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETOSIIRDATAVERIFICATIONBY_CI_CASEID_2);
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

				List<OsiInsolDataVerification> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetOSIIRDataVerificationBy_CI,
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
								"OsiInsolDataVerificationPersistenceImpl.fetchBygetOSIIRDataVerificationBy_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					OsiInsolDataVerification osiInsolDataVerification =
						list.get(0);

					result = osiInsolDataVerification;

					cacheResult(osiInsolDataVerification);
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
			return (OsiInsolDataVerification)result;
		}
	}

	/**
	 * Removes the osi insol data verification where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the osi insol data verification that was removed
	 */
	@Override
	public OsiInsolDataVerification removeBygetOSIIRDataVerificationBy_CI(
			String caseId)
		throws NoSuchOsiInsolDataVerificationException {

		OsiInsolDataVerification osiInsolDataVerification =
			findBygetOSIIRDataVerificationBy_CI(caseId);

		return remove(osiInsolDataVerification);
	}

	/**
	 * Returns the number of osi insol data verifications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching osi insol data verifications
	 */
	@Override
	public int countBygetOSIIRDataVerificationBy_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetOSIIRDataVerificationBy_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OSIINSOLDATAVERIFICATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETOSIIRDATAVERIFICATIONBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETOSIIRDATAVERIFICATIONBY_CI_CASEID_2);
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
		_FINDER_COLUMN_GETOSIIRDATAVERIFICATIONBY_CI_CASEID_2 =
			"osiInsolDataVerification.caseId = ?";

	private static final String
		_FINDER_COLUMN_GETOSIIRDATAVERIFICATIONBY_CI_CASEID_3 =
			"(osiInsolDataVerification.caseId IS NULL OR osiInsolDataVerification.caseId = '')";

	public OsiInsolDataVerificationPersistenceImpl() {
		setModelClass(OsiInsolDataVerification.class);

		setModelImplClass(OsiInsolDataVerificationImpl.class);
		setModelPKClass(long.class);

		setTable(OsiInsolDataVerificationTable.INSTANCE);
	}

	/**
	 * Caches the osi insol data verification in the entity cache if it is enabled.
	 *
	 * @param osiInsolDataVerification the osi insol data verification
	 */
	@Override
	public void cacheResult(OsiInsolDataVerification osiInsolDataVerification) {
		entityCache.putResult(
			OsiInsolDataVerificationImpl.class,
			osiInsolDataVerification.getPrimaryKey(), osiInsolDataVerification);

		finderCache.putResult(
			_finderPathFetchBygetOSIIRDataVerificationBy_CI,
			new Object[] {osiInsolDataVerification.getCaseId()},
			osiInsolDataVerification);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the osi insol data verifications in the entity cache if it is enabled.
	 *
	 * @param osiInsolDataVerifications the osi insol data verifications
	 */
	@Override
	public void cacheResult(
		List<OsiInsolDataVerification> osiInsolDataVerifications) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (osiInsolDataVerifications.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (OsiInsolDataVerification osiInsolDataVerification :
				osiInsolDataVerifications) {

			if (entityCache.getResult(
					OsiInsolDataVerificationImpl.class,
					osiInsolDataVerification.getPrimaryKey()) == null) {

				cacheResult(osiInsolDataVerification);
			}
		}
	}

	/**
	 * Clears the cache for all osi insol data verifications.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(OsiInsolDataVerificationImpl.class);

		finderCache.clearCache(OsiInsolDataVerificationImpl.class);
	}

	/**
	 * Clears the cache for the osi insol data verification.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(OsiInsolDataVerification osiInsolDataVerification) {
		entityCache.removeResult(
			OsiInsolDataVerificationImpl.class, osiInsolDataVerification);
	}

	@Override
	public void clearCache(
		List<OsiInsolDataVerification> osiInsolDataVerifications) {

		for (OsiInsolDataVerification osiInsolDataVerification :
				osiInsolDataVerifications) {

			entityCache.removeResult(
				OsiInsolDataVerificationImpl.class, osiInsolDataVerification);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(OsiInsolDataVerificationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				OsiInsolDataVerificationImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		OsiInsolDataVerificationModelImpl osiInsolDataVerificationModelImpl) {

		Object[] args = new Object[] {
			osiInsolDataVerificationModelImpl.getCaseId()
		};

		finderCache.putResult(
			_finderPathCountBygetOSIIRDataVerificationBy_CI, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOSIIRDataVerificationBy_CI, args,
			osiInsolDataVerificationModelImpl);
	}

	/**
	 * Creates a new osi insol data verification with the primary key. Does not add the osi insol data verification to the database.
	 *
	 * @param osiInsolDataVerificationId the primary key for the new osi insol data verification
	 * @return the new osi insol data verification
	 */
	@Override
	public OsiInsolDataVerification create(long osiInsolDataVerificationId) {
		OsiInsolDataVerification osiInsolDataVerification =
			new OsiInsolDataVerificationImpl();

		osiInsolDataVerification.setNew(true);
		osiInsolDataVerification.setPrimaryKey(osiInsolDataVerificationId);

		osiInsolDataVerification.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return osiInsolDataVerification;
	}

	/**
	 * Removes the osi insol data verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiInsolDataVerificationId the primary key of the osi insol data verification
	 * @return the osi insol data verification that was removed
	 * @throws NoSuchOsiInsolDataVerificationException if a osi insol data verification with the primary key could not be found
	 */
	@Override
	public OsiInsolDataVerification remove(long osiInsolDataVerificationId)
		throws NoSuchOsiInsolDataVerificationException {

		return remove((Serializable)osiInsolDataVerificationId);
	}

	/**
	 * Removes the osi insol data verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the osi insol data verification
	 * @return the osi insol data verification that was removed
	 * @throws NoSuchOsiInsolDataVerificationException if a osi insol data verification with the primary key could not be found
	 */
	@Override
	public OsiInsolDataVerification remove(Serializable primaryKey)
		throws NoSuchOsiInsolDataVerificationException {

		Session session = null;

		try {
			session = openSession();

			OsiInsolDataVerification osiInsolDataVerification =
				(OsiInsolDataVerification)session.get(
					OsiInsolDataVerificationImpl.class, primaryKey);

			if (osiInsolDataVerification == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchOsiInsolDataVerificationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(osiInsolDataVerification);
		}
		catch (NoSuchOsiInsolDataVerificationException noSuchEntityException) {
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
	protected OsiInsolDataVerification removeImpl(
		OsiInsolDataVerification osiInsolDataVerification) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(osiInsolDataVerification)) {
				osiInsolDataVerification =
					(OsiInsolDataVerification)session.get(
						OsiInsolDataVerificationImpl.class,
						osiInsolDataVerification.getPrimaryKeyObj());
			}

			if (osiInsolDataVerification != null) {
				session.delete(osiInsolDataVerification);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (osiInsolDataVerification != null) {
			clearCache(osiInsolDataVerification);
		}

		return osiInsolDataVerification;
	}

	@Override
	public OsiInsolDataVerification updateImpl(
		OsiInsolDataVerification osiInsolDataVerification) {

		boolean isNew = osiInsolDataVerification.isNew();

		if (!(osiInsolDataVerification instanceof
				OsiInsolDataVerificationModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(osiInsolDataVerification.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					osiInsolDataVerification);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in osiInsolDataVerification proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom OsiInsolDataVerification implementation " +
					osiInsolDataVerification.getClass());
		}

		OsiInsolDataVerificationModelImpl osiInsolDataVerificationModelImpl =
			(OsiInsolDataVerificationModelImpl)osiInsolDataVerification;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (osiInsolDataVerification.getCreateDate() == null)) {
			if (serviceContext == null) {
				osiInsolDataVerification.setCreateDate(date);
			}
			else {
				osiInsolDataVerification.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!osiInsolDataVerificationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				osiInsolDataVerification.setModifiedDate(date);
			}
			else {
				osiInsolDataVerification.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(osiInsolDataVerification);
			}
			else {
				osiInsolDataVerification =
					(OsiInsolDataVerification)session.merge(
						osiInsolDataVerification);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			OsiInsolDataVerificationImpl.class,
			osiInsolDataVerificationModelImpl, false, true);

		cacheUniqueFindersCache(osiInsolDataVerificationModelImpl);

		if (isNew) {
			osiInsolDataVerification.setNew(false);
		}

		osiInsolDataVerification.resetOriginalValues();

		return osiInsolDataVerification;
	}

	/**
	 * Returns the osi insol data verification with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the osi insol data verification
	 * @return the osi insol data verification
	 * @throws NoSuchOsiInsolDataVerificationException if a osi insol data verification with the primary key could not be found
	 */
	@Override
	public OsiInsolDataVerification findByPrimaryKey(Serializable primaryKey)
		throws NoSuchOsiInsolDataVerificationException {

		OsiInsolDataVerification osiInsolDataVerification = fetchByPrimaryKey(
			primaryKey);

		if (osiInsolDataVerification == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchOsiInsolDataVerificationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return osiInsolDataVerification;
	}

	/**
	 * Returns the osi insol data verification with the primary key or throws a <code>NoSuchOsiInsolDataVerificationException</code> if it could not be found.
	 *
	 * @param osiInsolDataVerificationId the primary key of the osi insol data verification
	 * @return the osi insol data verification
	 * @throws NoSuchOsiInsolDataVerificationException if a osi insol data verification with the primary key could not be found
	 */
	@Override
	public OsiInsolDataVerification findByPrimaryKey(
			long osiInsolDataVerificationId)
		throws NoSuchOsiInsolDataVerificationException {

		return findByPrimaryKey((Serializable)osiInsolDataVerificationId);
	}

	/**
	 * Returns the osi insol data verification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiInsolDataVerificationId the primary key of the osi insol data verification
	 * @return the osi insol data verification, or <code>null</code> if a osi insol data verification with the primary key could not be found
	 */
	@Override
	public OsiInsolDataVerification fetchByPrimaryKey(
		long osiInsolDataVerificationId) {

		return fetchByPrimaryKey((Serializable)osiInsolDataVerificationId);
	}

	/**
	 * Returns all the osi insol data verifications.
	 *
	 * @return the osi insol data verifications
	 */
	@Override
	public List<OsiInsolDataVerification> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi insol data verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolDataVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insol data verifications
	 * @param end the upper bound of the range of osi insol data verifications (not inclusive)
	 * @return the range of osi insol data verifications
	 */
	@Override
	public List<OsiInsolDataVerification> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi insol data verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolDataVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insol data verifications
	 * @param end the upper bound of the range of osi insol data verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi insol data verifications
	 */
	@Override
	public List<OsiInsolDataVerification> findAll(
		int start, int end,
		OrderByComparator<OsiInsolDataVerification> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi insol data verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolDataVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insol data verifications
	 * @param end the upper bound of the range of osi insol data verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi insol data verifications
	 */
	@Override
	public List<OsiInsolDataVerification> findAll(
		int start, int end,
		OrderByComparator<OsiInsolDataVerification> orderByComparator,
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

		List<OsiInsolDataVerification> list = null;

		if (useFinderCache) {
			list = (List<OsiInsolDataVerification>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_OSIINSOLDATAVERIFICATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_OSIINSOLDATAVERIFICATION;

				sql = sql.concat(
					OsiInsolDataVerificationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<OsiInsolDataVerification>)QueryUtil.list(
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
	 * Removes all the osi insol data verifications from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (OsiInsolDataVerification osiInsolDataVerification : findAll()) {
			remove(osiInsolDataVerification);
		}
	}

	/**
	 * Returns the number of osi insol data verifications.
	 *
	 * @return the number of osi insol data verifications
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
					_SQL_COUNT_OSIINSOLDATAVERIFICATION);

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
		return "osiInsolDataVerificationId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_OSIINSOLDATAVERIFICATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return OsiInsolDataVerificationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the osi insol data verification persistence.
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

		_finderPathFetchBygetOSIIRDataVerificationBy_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetOSIIRDataVerificationBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetOSIIRDataVerificationBy_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetOSIIRDataVerificationBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		OsiInsolDataVerificationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		OsiInsolDataVerificationUtil.setPersistence(null);

		entityCache.removeCache(OsiInsolDataVerificationImpl.class.getName());
	}

	@Override
	@Reference(
		target = OSI_INSOLVENCY_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = OSI_INSOLVENCY_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = OSI_INSOLVENCY_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_OSIINSOLDATAVERIFICATION =
		"SELECT osiInsolDataVerification FROM OsiInsolDataVerification osiInsolDataVerification";

	private static final String _SQL_SELECT_OSIINSOLDATAVERIFICATION_WHERE =
		"SELECT osiInsolDataVerification FROM OsiInsolDataVerification osiInsolDataVerification WHERE ";

	private static final String _SQL_COUNT_OSIINSOLDATAVERIFICATION =
		"SELECT COUNT(osiInsolDataVerification) FROM OsiInsolDataVerification osiInsolDataVerification";

	private static final String _SQL_COUNT_OSIINSOLDATAVERIFICATION_WHERE =
		"SELECT COUNT(osiInsolDataVerification) FROM OsiInsolDataVerification osiInsolDataVerification WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"osiInsolDataVerification.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No OsiInsolDataVerification exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No OsiInsolDataVerification exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		OsiInsolDataVerificationPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}