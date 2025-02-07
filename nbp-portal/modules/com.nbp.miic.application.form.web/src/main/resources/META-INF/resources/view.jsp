<%@ include file="/init.jsp" %>
<%@ include file="/miic-process-wizard.jsp" %>
<%@ include file="/miic-popup.jsp" %>
<div class="modal fade commonsavepopup savecountinuePopup" data-keyboard="false" tabindex="-1"
    aria-labelledby="staticBackdropLabel" aria-hidden="true" style="display:none;">
    <div class="modal-dialog modal-dialog-centered my-0 modal-dialog-sm">
        <div class="modal-content">
        	<div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
		          <span aria-hidden="true">&times;</span>
		        </button>
            </div>
            <div class="modal-pic">
                <img src="<%=themeDisplay.getPathThemeImages()%>/popup.png" class="img-fluid" />
            </div>
            <div class="modal-body">
                <div class="row">
                    <div class="col-md-12">
                        <p class="modal-title f1">Application saved as draft</p>
                        <p class="modal-subtitle f2">Your application for MIIC (<span class="draft-application-type"></span>) has been correctly saved as a draft.</p>
                        <p class="modal-info f2">
                            You will be able to continue your application process at any moment. You can find the draft
                            in
                            <a href="/group/guest/dashboard">your Dashboard:</a>
                        </p>
                    </div>
                    <div class="col-md-12">
                        <div class="cards-wrapper">
                            <div class="row">
                                <div class="col-lg-5 d-flex justify-content-center">
                                    <div class="licence-box ml-2">
                                        <div class="left">
                                            <svg xmlns="http://www.w3.org/2000/svg" width="48" height="48" viewBox="0 0 220 220" fill="none">
												<path d="M202.812 195.938H17.1875V202.812H202.812V195.938Z" fill="#047247"></path>
												<path d="M178.75 165H171.875V171.875H178.75V165Z" fill="#047247"></path>
												<path d="M171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM41.25 165V171.875H48.125V165H41.25ZM171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM171.875 137.5V144.375H178.75V137.5H171.875ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM171.875 137.5V144.375H178.75V137.5H171.875ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM127.188 127.188V189.063H147.812V127.188H127.188ZM171.875 137.5V144.375H178.75V137.5H171.875ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM171.875 137.5V144.375H178.75V137.5H171.875ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM99.6875 127.188V189.063H120.312V127.188H99.6875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM171.875 137.5V144.375H178.75V137.5H171.875ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM72.1875 127.188V189.063H92.8125V127.188H72.1875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM171.875 137.5V144.375H178.75V137.5H171.875ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM58.4375 127.188C57.5258 127.188 56.6515 126.826 56.0068 126.181C55.3622 125.536 55 124.662 55 123.75V120.313H24.0625V189.063H65.3125V127.188H58.4375ZM55 175.313C55 176.225 54.6378 177.099 53.9932 177.744C53.3485 178.388 52.4742 178.75 51.5625 178.75H37.8125C36.9008 178.75 36.0265 178.388 35.3818 177.744C34.7372 177.099 34.375 176.225 34.375 175.313V161.563C34.375 160.651 34.7372 159.777 35.3818 159.132C36.0265 158.488 36.9008 158.125 37.8125 158.125H51.5625C52.4742 158.125 53.3485 158.488 53.9932 159.132C54.6378 159.777 55 160.651 55 161.563V175.313ZM55 147.813C55 148.725 54.6378 149.599 53.9932 150.244C53.3485 150.888 52.4742 151.25 51.5625 151.25H37.8125C36.9008 151.25 36.0265 150.888 35.3818 150.244C34.7372 149.599 34.375 148.725 34.375 147.813V134.063C34.375 133.151 34.7372 132.277 35.3818 131.632C36.0265 130.988 36.9008 130.625 37.8125 130.625H51.5625C52.4742 130.625 53.3485 130.988 53.9932 131.632C54.6378 132.277 55 133.151 55 134.063V147.813ZM41.25 171.875H48.125V165H41.25V171.875ZM41.25 144.375H48.125V137.5H41.25V144.375ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM165 120.313V123.75C165 124.662 164.638 125.536 163.993 126.181C163.349 126.826 162.474 127.188 161.562 127.188H154.688V189.063H195.938V120.313H165ZM185.625 175.313C185.625 176.225 185.263 177.099 184.618 177.744C183.974 178.388 183.099 178.75 182.188 178.75H168.438C167.526 178.75 166.651 178.388 166.007 177.744C165.362 177.099 165 176.225 165 175.313V161.563C165 160.651 165.362 159.777 166.007 159.132C166.651 158.488 167.526 158.125 168.438 158.125H182.188C183.099 158.125 183.974 158.488 184.618 159.132C185.263 159.777 185.625 160.651 185.625 161.563V175.313ZM185.625 147.813C185.625 148.725 185.263 149.599 184.618 150.244C183.974 150.888 183.099 151.25 182.188 151.25H168.438C167.526 151.25 166.651 150.888 166.007 150.244C165.362 149.599 165 148.725 165 147.813V134.063C165 133.151 165.362 132.277 166.007 131.632C166.651 130.988 167.526 130.625 168.438 130.625H182.188C183.099 130.625 183.974 130.988 184.618 131.632C185.263 132.277 185.625 133.151 185.625 134.063V147.813ZM171.875 144.375H178.75V137.5H171.875V144.375ZM171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM72.1875 55.0004V75.6254H147.812V55.0004H72.1875ZM85.9375 68.7504C85.9375 69.6621 85.5753 70.5365 84.9307 71.1811C84.286 71.8258 83.4117 72.1879 82.5 72.1879C81.5883 72.1879 80.714 71.8258 80.0693 71.1811C79.4247 70.5365 79.0625 69.6621 79.0625 68.7504V61.8754C79.0625 60.9638 79.4247 60.0894 80.0693 59.4448C80.714 58.8001 81.5883 58.4379 82.5 58.4379C83.4117 58.4379 84.286 58.8001 84.9307 59.4448C85.5753 60.0894 85.9375 60.9638 85.9375 61.8754V68.7504ZM99.6875 68.7504C99.6875 69.6621 99.3253 70.5365 98.6807 71.1811C98.036 71.8258 97.1617 72.1879 96.25 72.1879C95.3383 72.1879 94.464 71.8258 93.8193 71.1811C93.1747 70.5365 92.8125 69.6621 92.8125 68.7504V61.8754C92.8125 60.9638 93.1747 60.0894 93.8193 59.4448C94.464 58.8001 95.3383 58.4379 96.25 58.4379C97.1617 58.4379 98.036 58.8001 98.6807 59.4448C99.3253 60.0894 99.6875 60.9638 99.6875 61.8754V68.7504ZM113.438 68.7504C113.438 69.6621 113.075 70.5365 112.431 71.1811C111.786 71.8258 110.912 72.1879 110 72.1879C109.088 72.1879 108.214 71.8258 107.569 71.1811C106.925 70.5365 106.562 69.6621 106.562 68.7504V61.8754C106.562 60.9638 106.925 60.0894 107.569 59.4448C108.214 58.8001 109.088 58.4379 110 58.4379C110.912 58.4379 111.786 58.8001 112.431 59.4448C113.075 60.0894 113.438 60.9638 113.438 61.8754V68.7504ZM127.188 68.7504C127.188 69.6621 126.825 70.5365 126.181 71.1811C125.536 71.8258 124.662 72.1879 123.75 72.1879C122.838 72.1879 121.964 71.8258 121.319 71.1811C120.675 70.5365 120.312 69.6621 120.312 68.7504V61.8754C120.312 60.9638 120.675 60.0894 121.319 59.4448C121.964 58.8001 122.838 58.4379 123.75 58.4379C124.662 58.4379 125.536 58.8001 126.181 59.4448C126.825 60.0894 127.188 60.9638 127.188 61.8754V68.7504ZM140.938 68.7504C140.938 69.6621 140.575 70.5365 139.931 71.1811C139.286 71.8258 138.412 72.1879 137.5 72.1879C136.588 72.1879 135.714 71.8258 135.069 71.1811C134.425 70.5365 134.062 69.6621 134.062 68.7504V61.8754C134.062 60.9638 134.425 60.0894 135.069 59.4448C135.714 58.8001 136.588 58.4379 137.5 58.4379C138.412 58.4379 139.286 58.8001 139.931 59.4448C140.575 60.0894 140.938 60.9638 140.938 61.8754V68.7504ZM120.312 17.1879H99.6875C91.1657 17.1878 82.9477 20.3531 76.6278 26.0696C70.3078 31.7861 66.3365 39.6464 65.4844 48.1254H154.688C153.832 39.6168 149.837 31.7324 143.48 26.0118C137.124 20.2911 128.864 17.1451 120.312 17.1879ZM164.312 82.5004H55.6875L17.1875 98.5536V113.438H55V110C54.9734 109.224 55.2104 108.462 55.6723 107.838C56.1342 107.214 56.7938 106.764 57.5437 106.563L109.106 92.8129C109.694 92.6752 110.306 92.6752 110.894 92.8129L162.456 106.563C163.206 106.764 163.866 107.214 164.328 107.838C164.79 108.462 165.027 109.224 165 110V113.438H202.812V98.5536L164.312 82.5004ZM171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM110 99.6879L61.875 112.647V120.313H158.125V112.647L110 99.6879ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM171.875 137.5V144.375H178.75V137.5H171.875ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM171.875 137.5V144.375H178.75V137.5H171.875ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM171.875 137.5V144.375H178.75V137.5H171.875ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM171.875 137.5V144.375H178.75V137.5H171.875ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM171.875 137.5V144.375H178.75V137.5H171.875ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM171.875 137.5V144.375H178.75V137.5H171.875ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM171.875 137.5V144.375H178.75V137.5H171.875ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM171.875 137.5V144.375H178.75V137.5H171.875ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM41.25 165V171.875H48.125V165H41.25ZM41.25 137.5V144.375H48.125V137.5H41.25ZM171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875ZM171.875 137.5V144.375H178.75V137.5H171.875Z" fill="#047247"></path>
											</svg>
                                        </div>
                                        <div class="right pl-2">
                                            <p class="licence-title f2">MIIC<br> Transaction Number</p>
                                            <p class="licence-number f2" id="pop_app_no"></p>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-lg-4 d-flex justify-content-center">
                                    <div class="tier-box">
                                        <p class="tier-box-upper f2">Category</p>
                                        <p class="tier-box-upper f2" id="pop_category"></p>
                                    </div>
                                </div>
                                <div class="col-lg-3 d-flex justify-content-center">
                                    <div class="status-box">
                                        <p class="tier-box-upper f2">
                                            Status
                                        </p>
                                        <a href="" class="draftlink f2" id="pop_status">Draft</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-12">
                        <div class="footer-above-border"></div>
                    </div>
                </div>
            </div>
            <div class="modal-footer border-0 d-flex justify-content-between">
                <div><a href="/home" class="text-dark common-nav-links text-white popup-home hidePopup">
                        <span class="mr-2"><svg width="16" height="16" viewBox="0 0 16 16" fill="none"
                                xmlns="http://www.w3.org/2000/svg">
                                <path d="M16 7H3.83L9.42 1.41L8 0L0 8L8 16L9.41 14.59L3.83 9H16V7Z" fill="#282524" />
                            </svg>
                        </span>Go back to the Homepage</a>
                </div>
                <div>
                    <a href="/group/guest/dashboard" data-senna-off="true" class="common-yellow-bg text-dark common-nav-links text-white popup-dashboard ">
                        Continue to your dashboard<span class="ml-2">
                            <svg width="22" height="17" viewBox="0 0 22 17" fill="none"
                                xmlns="http://www.w3.org/2000/svg">
                                <path
                                    d="M20 5C18.55 5 17.74 6.44 18.07 7.51L14.52 11.07C14.22 10.98 13.78 10.98 13.48 11.07L10.93 8.52C11.27 7.45 10.46 6 9 6C7.55 6 6.73 7.44 7.07 8.52L2.51 13.07C1.44 12.74 0 13.55 0 15C0 16.1 0.9 17 2 17C3.45 17 4.26 15.56 3.93 14.49L8.48 9.93C8.78 10.02 9.22 10.02 9.52 9.93L12.07 12.48C11.73 13.55 12.54 15 14 15C15.45 15 16.27 13.56 15.93 12.48L19.49 8.93C20.56 9.26 22 8.45 22 7C22 5.9 21.1 5 20 5Z"
                                    fill="#1B1917" />
                                <path d="M14 6L14.94 3.93L17 3L14.94 2.07L14 0L13.08 2.07L11 3L13.08 3.93L14 6Z"
                                    fill="#1B1917" />
                                <path d="M2.5 8L3 6L5 5.5L3 5L2.5 3L2 5L0 5.5L2 6L2.5 8Z" fill="#323232" />
                            </svg>

                        </span>
                    </a>
                </div>
            </div>
        </div>
    </div>
</div>
<script>
function nextTab(elem) {
	$(elem).parent().next().find('a[data-toggle="tab"]').click();
}
$(".hidePopup").click(function () {
	$(".editCetSuspensionDetailPopup").modal("hide");
	$(".editMaterialRequiredDetailPopup").modal("hide");
	$(".editgoodsProducedDetailopup").modal("hide");
});

$(document).ready(function(){
	continueApplicationForm();

});

//Save And Continue Functions
function continueApplicationForm(){
	var miicApplicationId = "<%=miicApplicationId%>";
	if(miicApplicationId > 0 ){
		showLastFormStep();
		showSelectedCategory();
		continueEditFormDetails();
	}
}

function showLastFormStep(){
	var currentStage = "<%=currentStage%>";
	$( ".form-wizard-header .application-form-lower-heading" ).each( function( index, element ){
	    if($(this).text() == currentStage ){
	    	$(this).parents("li").addClass("active");
	    	$(this).parents("li").prevAll().removeClass("active");
	    	$(this).parents("li").prevAll().addClass("activated");
	    }
	});
	
	$( ".form-wizard fieldset" ).each( function( index, element ){
        if($(this).attr("name") == currentStage ){
	    	$(this).addClass("show");
	    	$(this).prevAll().removeClass("show");
    	}
	});
}

function continueEditFormDetails(){
	var lastFormStep = "<%=lastFormStep%>";
	console.log('lastFormStep***'+lastFormStep);
	lastFormDetailsStep = $(".tab-pane.active").attr("id");
	$(".tab-content .tab-pane").each(function(index, element) {
		if ($(this).attr("id") == lastFormStep) {
			$(this).addClass("active");
			$(this).prevAll().removeClass("active");
			$(this).nextAll().removeClass("active");
		}
	});
	$(".tab-plus-wizard-left li a").each(
			function(index, element) {
				if ($(this).attr("href") == "#" + lastFormStep) {
					$(this).parents().prevAll("li").find("a").removeClass("active disabled");
					$(this).addClass("active");
					$(this).removeClass("disabled");
				}
			});
}


function showSelectedCategory(){
	currentStage = "<%=currentStage%>";
	lastFormStep = "<%=lastFormStep%>";
	miicApplication="<%=miicApplication%>";
	typeOfManufacturer="<%=typeOfManufacturer%>";
	typeOfTransaction="<%=typeOfTransaction%>";
	susOfSezSize="<%=susOfSezSize%>";
	safeguardMaterialSize="<%=safeguardMaterialSize%>";
	safeguardAddSize="<%=safeguardAddSize%>";
	nameOfApplicant="<%=safeguardAddSize%>";
	natureOfApplicant="<%=natureOfApplicant%>";
	$("#miicApplicationId").val(<%=miicApplicationId%>);
	$("#miic-type-option-value").val(miicApplication);
	$("#miicOptionValue").val(typeOfManufacturer);
	$("#project-type-option-value").val(typeOfTransaction);
	gettingDocumentList();
	 if(miicApplication != ""){
			$("#miic-application-type-box .wizard-title span").each( function( index, element ){
		        if($(this).text() == miicApplication ){
			    	$(this).closest('a').addClass("active");
			    }
			});
		} 
		if(miicApplication== 'Suspension of CET'){
			$("#miicRegistrationTypeBox, .cet-option, #miicProcessCetForm, #miicProcessCetPreview").removeClass("hide");
			$("#miicTransationTypeBox, .safeguard-option, #miicProcessSafeguardForm, #miicProcessSafeguardPreview").addClass("hide");
			$(".miicProcessTypeFormTab").html("Suspension of CET");
			$(".supporting-doc-preview").removeClass("hide");
			if(susOfSezSize>0){
			$(".addCetSuspensionDetailTableBox").removeClass("hide");
			}
		}else{
			$("#miicRegistrationTypeBox, .cet-option, #miicProcessCetForm, #miicProcessCetPreview").addClass("hide");
			$("#miicTransationTypeBox, .safeguard-option, #miicProcessSafeguardForm, #miicProcessSafeguardPreview").removeClass("hide");
			$(".miicProcessTypeFormTab").html("Safeguard Mechanism");
			$(".supporting-doc-preview").addClass("hide");
			if(safeguardMaterialSize>0){
		    $(".addMaterialRequiredDetailTableBox").removeClass("hide");	
			}if(safeguardAddSize>0){
			$(".addGoodsProducedTableBox").removeClass("hide");	
			}
		}
		if(natureOfApplicant=="Individual"){
			$(".indiApplication").removeClass("hide");	
		}else if(natureOfApplicant=="Company"){
			$(".comApplication").removeClass("hide");	
		}
	
	if (miicApplication == "Suspension of CET") {
			if (typeOfManufacturer != "") {
				$("#miicRegistrationTypeBox .wizard-title").each(function(index, element) {
				if ($(this).text() == typeOfManufacturer) {
				$(this).closest(".wizard-card").addClass("active").click();
							}
		});
			}
		}
		if (typeOfTransaction != "") {
			$("#miicTransationTypeBox .wizard-title").each(function(index, element) {
				if ($(this).text() == typeOfTransaction) {
				$(this).closest(".wizard-card").addClass("active");
				$("#miicCategoryTypeFieldset #save-continue").css({
				"opacity" : "1","pointer-events" : "auto","cursor" : "pointer"
			  });
		  }
	  });
  }
}
</script>