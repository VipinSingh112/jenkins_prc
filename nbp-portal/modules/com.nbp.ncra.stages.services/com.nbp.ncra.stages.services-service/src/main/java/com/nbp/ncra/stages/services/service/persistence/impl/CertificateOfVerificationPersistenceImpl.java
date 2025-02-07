/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.stages.services.service.persistence.impl;

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

import com.nbp.ncra.stages.services.exception.NoSuchCertificateOfVerificationException;
import com.nbp.ncra.stages.services.model.CertificateOfVerification;
import com.nbp.ncra.stages.services.model.CertificateOfVerificationTable;
import com.nbp.ncra.stages.services.model.impl.CertificateOfVerificationImpl;
import com.nbp.ncra.stages.services.model.impl.CertificateOfVerificationModelImpl;
import com.nbp.ncra.stages.services.service.persistence.CertificateOfVerificationPersistence;
import com.nbp.ncra.stages.services.service.persistence.CertificateOfVerificationUtil;
import com.nbp.ncra.stages.services.service.persistence.impl.constants.NCRA_APPLICATION_STAGEPersistenceConstants;

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
 * The persistence implementation for the certificate of verification service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = CertificateOfVerificationPersistence.class)
public class CertificateOfVerificationPersistenceImpl
	extends BasePersistenceImpl<CertificateOfVerification>
	implements CertificateOfVerificationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>CertificateOfVerificationUtil</code> to access the certificate of verification persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		CertificateOfVerificationImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetNcra_By_CaseId;
	private FinderPath _finderPathCountBygetNcra_By_CaseId;

	/**
	 * Returns the certificate of verification where caseId = &#63; or throws a <code>NoSuchCertificateOfVerificationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching certificate of verification
	 * @throws NoSuchCertificateOfVerificationException if a matching certificate of verification could not be found
	 */
	@Override
	public CertificateOfVerification findBygetNcra_By_CaseId(String caseId)
		throws NoSuchCertificateOfVerificationException {

		CertificateOfVerification certificateOfVerification =
			fetchBygetNcra_By_CaseId(caseId);

		if (certificateOfVerification == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchCertificateOfVerificationException(sb.toString());
		}

		return certificateOfVerification;
	}

	/**
	 * Returns the certificate of verification where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching certificate of verification, or <code>null</code> if a matching certificate of verification could not be found
	 */
	@Override
	public CertificateOfVerification fetchBygetNcra_By_CaseId(String caseId) {
		return fetchBygetNcra_By_CaseId(caseId, true);
	}

	/**
	 * Returns the certificate of verification where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching certificate of verification, or <code>null</code> if a matching certificate of verification could not be found
	 */
	@Override
	public CertificateOfVerification fetchBygetNcra_By_CaseId(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetNcra_By_CaseId, finderArgs, this);
		}

		if (result instanceof CertificateOfVerification) {
			CertificateOfVerification certificateOfVerification =
				(CertificateOfVerification)result;

			if (!Objects.equals(
					caseId, certificateOfVerification.getCaseId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_CERTIFICATEOFVERIFICATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETNCRA_BY_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETNCRA_BY_CASEID_CASEID_2);
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

				List<CertificateOfVerification> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetNcra_By_CaseId, finderArgs,
							list);
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
								"CertificateOfVerificationPersistenceImpl.fetchBygetNcra_By_CaseId(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					CertificateOfVerification certificateOfVerification =
						list.get(0);

					result = certificateOfVerification;

					cacheResult(certificateOfVerification);
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
			return (CertificateOfVerification)result;
		}
	}

	/**
	 * Removes the certificate of verification where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the certificate of verification that was removed
	 */
	@Override
	public CertificateOfVerification removeBygetNcra_By_CaseId(String caseId)
		throws NoSuchCertificateOfVerificationException {

		CertificateOfVerification certificateOfVerification =
			findBygetNcra_By_CaseId(caseId);

		return remove(certificateOfVerification);
	}

	/**
	 * Returns the number of certificate of verifications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching certificate of verifications
	 */
	@Override
	public int countBygetNcra_By_CaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetNcra_By_CaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CERTIFICATEOFVERIFICATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETNCRA_BY_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETNCRA_BY_CASEID_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETNCRA_BY_CASEID_CASEID_2 =
		"certificateOfVerification.caseId = ?";

	private static final String _FINDER_COLUMN_GETNCRA_BY_CASEID_CASEID_3 =
		"(certificateOfVerification.caseId IS NULL OR certificateOfVerification.caseId = '')";

	public CertificateOfVerificationPersistenceImpl() {
		setModelClass(CertificateOfVerification.class);

		setModelImplClass(CertificateOfVerificationImpl.class);
		setModelPKClass(long.class);

		setTable(CertificateOfVerificationTable.INSTANCE);
	}

	/**
	 * Caches the certificate of verification in the entity cache if it is enabled.
	 *
	 * @param certificateOfVerification the certificate of verification
	 */
	@Override
	public void cacheResult(
		CertificateOfVerification certificateOfVerification) {

		entityCache.putResult(
			CertificateOfVerificationImpl.class,
			certificateOfVerification.getPrimaryKey(),
			certificateOfVerification);

		finderCache.putResult(
			_finderPathFetchBygetNcra_By_CaseId,
			new Object[] {certificateOfVerification.getCaseId()},
			certificateOfVerification);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the certificate of verifications in the entity cache if it is enabled.
	 *
	 * @param certificateOfVerifications the certificate of verifications
	 */
	@Override
	public void cacheResult(
		List<CertificateOfVerification> certificateOfVerifications) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (certificateOfVerifications.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (CertificateOfVerification certificateOfVerification :
				certificateOfVerifications) {

			if (entityCache.getResult(
					CertificateOfVerificationImpl.class,
					certificateOfVerification.getPrimaryKey()) == null) {

				cacheResult(certificateOfVerification);
			}
		}
	}

	/**
	 * Clears the cache for all certificate of verifications.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CertificateOfVerificationImpl.class);

		finderCache.clearCache(CertificateOfVerificationImpl.class);
	}

	/**
	 * Clears the cache for the certificate of verification.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		CertificateOfVerification certificateOfVerification) {

		entityCache.removeResult(
			CertificateOfVerificationImpl.class, certificateOfVerification);
	}

	@Override
	public void clearCache(
		List<CertificateOfVerification> certificateOfVerifications) {

		for (CertificateOfVerification certificateOfVerification :
				certificateOfVerifications) {

			entityCache.removeResult(
				CertificateOfVerificationImpl.class, certificateOfVerification);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(CertificateOfVerificationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				CertificateOfVerificationImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		CertificateOfVerificationModelImpl certificateOfVerificationModelImpl) {

		Object[] args = new Object[] {
			certificateOfVerificationModelImpl.getCaseId()
		};

		finderCache.putResult(
			_finderPathCountBygetNcra_By_CaseId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetNcra_By_CaseId, args,
			certificateOfVerificationModelImpl);
	}

	/**
	 * Creates a new certificate of verification with the primary key. Does not add the certificate of verification to the database.
	 *
	 * @param certificateOfVerificationId the primary key for the new certificate of verification
	 * @return the new certificate of verification
	 */
	@Override
	public CertificateOfVerification create(long certificateOfVerificationId) {
		CertificateOfVerification certificateOfVerification =
			new CertificateOfVerificationImpl();

		certificateOfVerification.setNew(true);
		certificateOfVerification.setPrimaryKey(certificateOfVerificationId);

		certificateOfVerification.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return certificateOfVerification;
	}

	/**
	 * Removes the certificate of verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param certificateOfVerificationId the primary key of the certificate of verification
	 * @return the certificate of verification that was removed
	 * @throws NoSuchCertificateOfVerificationException if a certificate of verification with the primary key could not be found
	 */
	@Override
	public CertificateOfVerification remove(long certificateOfVerificationId)
		throws NoSuchCertificateOfVerificationException {

		return remove((Serializable)certificateOfVerificationId);
	}

	/**
	 * Removes the certificate of verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the certificate of verification
	 * @return the certificate of verification that was removed
	 * @throws NoSuchCertificateOfVerificationException if a certificate of verification with the primary key could not be found
	 */
	@Override
	public CertificateOfVerification remove(Serializable primaryKey)
		throws NoSuchCertificateOfVerificationException {

		Session session = null;

		try {
			session = openSession();

			CertificateOfVerification certificateOfVerification =
				(CertificateOfVerification)session.get(
					CertificateOfVerificationImpl.class, primaryKey);

			if (certificateOfVerification == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCertificateOfVerificationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(certificateOfVerification);
		}
		catch (NoSuchCertificateOfVerificationException noSuchEntityException) {
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
	protected CertificateOfVerification removeImpl(
		CertificateOfVerification certificateOfVerification) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(certificateOfVerification)) {
				certificateOfVerification =
					(CertificateOfVerification)session.get(
						CertificateOfVerificationImpl.class,
						certificateOfVerification.getPrimaryKeyObj());
			}

			if (certificateOfVerification != null) {
				session.delete(certificateOfVerification);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (certificateOfVerification != null) {
			clearCache(certificateOfVerification);
		}

		return certificateOfVerification;
	}

	@Override
	public CertificateOfVerification updateImpl(
		CertificateOfVerification certificateOfVerification) {

		boolean isNew = certificateOfVerification.isNew();

		if (!(certificateOfVerification instanceof
				CertificateOfVerificationModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(certificateOfVerification.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					certificateOfVerification);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in certificateOfVerification proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom CertificateOfVerification implementation " +
					certificateOfVerification.getClass());
		}

		CertificateOfVerificationModelImpl certificateOfVerificationModelImpl =
			(CertificateOfVerificationModelImpl)certificateOfVerification;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (certificateOfVerification.getCreateDate() == null)) {
			if (serviceContext == null) {
				certificateOfVerification.setCreateDate(date);
			}
			else {
				certificateOfVerification.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!certificateOfVerificationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				certificateOfVerification.setModifiedDate(date);
			}
			else {
				certificateOfVerification.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(certificateOfVerification);
			}
			else {
				certificateOfVerification =
					(CertificateOfVerification)session.merge(
						certificateOfVerification);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			CertificateOfVerificationImpl.class,
			certificateOfVerificationModelImpl, false, true);

		cacheUniqueFindersCache(certificateOfVerificationModelImpl);

		if (isNew) {
			certificateOfVerification.setNew(false);
		}

		certificateOfVerification.resetOriginalValues();

		return certificateOfVerification;
	}

	/**
	 * Returns the certificate of verification with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the certificate of verification
	 * @return the certificate of verification
	 * @throws NoSuchCertificateOfVerificationException if a certificate of verification with the primary key could not be found
	 */
	@Override
	public CertificateOfVerification findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCertificateOfVerificationException {

		CertificateOfVerification certificateOfVerification = fetchByPrimaryKey(
			primaryKey);

		if (certificateOfVerification == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCertificateOfVerificationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return certificateOfVerification;
	}

	/**
	 * Returns the certificate of verification with the primary key or throws a <code>NoSuchCertificateOfVerificationException</code> if it could not be found.
	 *
	 * @param certificateOfVerificationId the primary key of the certificate of verification
	 * @return the certificate of verification
	 * @throws NoSuchCertificateOfVerificationException if a certificate of verification with the primary key could not be found
	 */
	@Override
	public CertificateOfVerification findByPrimaryKey(
			long certificateOfVerificationId)
		throws NoSuchCertificateOfVerificationException {

		return findByPrimaryKey((Serializable)certificateOfVerificationId);
	}

	/**
	 * Returns the certificate of verification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param certificateOfVerificationId the primary key of the certificate of verification
	 * @return the certificate of verification, or <code>null</code> if a certificate of verification with the primary key could not be found
	 */
	@Override
	public CertificateOfVerification fetchByPrimaryKey(
		long certificateOfVerificationId) {

		return fetchByPrimaryKey((Serializable)certificateOfVerificationId);
	}

	/**
	 * Returns all the certificate of verifications.
	 *
	 * @return the certificate of verifications
	 */
	@Override
	public List<CertificateOfVerification> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the certificate of verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CertificateOfVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of certificate of verifications
	 * @param end the upper bound of the range of certificate of verifications (not inclusive)
	 * @return the range of certificate of verifications
	 */
	@Override
	public List<CertificateOfVerification> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the certificate of verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CertificateOfVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of certificate of verifications
	 * @param end the upper bound of the range of certificate of verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of certificate of verifications
	 */
	@Override
	public List<CertificateOfVerification> findAll(
		int start, int end,
		OrderByComparator<CertificateOfVerification> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the certificate of verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CertificateOfVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of certificate of verifications
	 * @param end the upper bound of the range of certificate of verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of certificate of verifications
	 */
	@Override
	public List<CertificateOfVerification> findAll(
		int start, int end,
		OrderByComparator<CertificateOfVerification> orderByComparator,
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

		List<CertificateOfVerification> list = null;

		if (useFinderCache) {
			list = (List<CertificateOfVerification>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_CERTIFICATEOFVERIFICATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_CERTIFICATEOFVERIFICATION;

				sql = sql.concat(
					CertificateOfVerificationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<CertificateOfVerification>)QueryUtil.list(
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
	 * Removes all the certificate of verifications from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CertificateOfVerification certificateOfVerification : findAll()) {
			remove(certificateOfVerification);
		}
	}

	/**
	 * Returns the number of certificate of verifications.
	 *
	 * @return the number of certificate of verifications
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
					_SQL_COUNT_CERTIFICATEOFVERIFICATION);

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
		return "certificateOfVerificationId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_CERTIFICATEOFVERIFICATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return CertificateOfVerificationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the certificate of verification persistence.
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

		_finderPathFetchBygetNcra_By_CaseId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetNcra_By_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetNcra_By_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetNcra_By_CaseId", new String[] {String.class.getName()},
			new String[] {"caseId"}, false);

		CertificateOfVerificationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		CertificateOfVerificationUtil.setPersistence(null);

		entityCache.removeCache(CertificateOfVerificationImpl.class.getName());
	}

	@Override
	@Reference(
		target = NCRA_APPLICATION_STAGEPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = NCRA_APPLICATION_STAGEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = NCRA_APPLICATION_STAGEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_CERTIFICATEOFVERIFICATION =
		"SELECT certificateOfVerification FROM CertificateOfVerification certificateOfVerification";

	private static final String _SQL_SELECT_CERTIFICATEOFVERIFICATION_WHERE =
		"SELECT certificateOfVerification FROM CertificateOfVerification certificateOfVerification WHERE ";

	private static final String _SQL_COUNT_CERTIFICATEOFVERIFICATION =
		"SELECT COUNT(certificateOfVerification) FROM CertificateOfVerification certificateOfVerification";

	private static final String _SQL_COUNT_CERTIFICATEOFVERIFICATION_WHERE =
		"SELECT COUNT(certificateOfVerification) FROM CertificateOfVerification certificateOfVerification WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"certificateOfVerification.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No CertificateOfVerification exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No CertificateOfVerification exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		CertificateOfVerificationPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}